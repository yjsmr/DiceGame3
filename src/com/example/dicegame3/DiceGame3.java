package com.example.dicegame3;
import java.util.Random;
import java.util.Scanner;
/*
 * User can choose how many rounds the user wants to play.
 * The game starts with a random integer between 1 to 6. Which is the value of the computers die.
 * Another random integer in the same range is cast and this is the value of the players die.
 * If dice is of the same value it will be a tie (but is still in the final result)
 * Program keeps count on who wins and will declare if it’s the player or the computer
 */


public class DiceGame3 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello and welcome! Let's play a game.");
        System.out.println("First of all, just enter how many times you'd like to throw a dice with the comp(etitor): ");
        int numberOfTurns = scan.nextInt();
        int compDie;
        int compSum = 0;
        int userDie;
        int userSum = 0;

        for (int i = 1; i <= numberOfTurns; i++){
            compDie = random.nextInt(6) + 1;
            userDie = random.nextInt(6) + 1;
            if(compDie > userDie ){
                compSum = compSum + 1;
                System.out.println("This round was won by the computer with " + compDie + " against " + userDie);

            } else if (userDie > compDie){
                userSum = userSum + 1;
                System.out.println("This round was won by you with " + userDie + " against " + compDie);
            } else {
                compSum = compSum + 1;
                userSum = userSum + 1;
                System.out.println("It's a tie! You both had " + userDie);
            }


        }
        if(compSum > userSum){
            System.out.println("You lost, the computer won with the total point of " + compSum );
        } else if (userSum > compSum){
            System.out.println("You won with the total point of " + userSum + " compared with the computers point of " + compSum);
        } else if (userSum == compSum){
            System.out.println("It's a tie! You are both winners..., or losers. With a total point of " +userSum );
        }
    }
}
