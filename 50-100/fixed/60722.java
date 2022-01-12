public void askToPlayAgain(java.util.Scanner input) {
    java.lang.System.out.println((("Your new balance is " + (player.showBalance())) + " Would you like to play again? 1 for Yes, 2 for No"));
    int playAgain = input.nextInt();
    if ((playAgain == 1) && (gameInSession)) {
        placeBet();
    }
    if (playAgain == 2) {
        java.lang.System.out.println("Thank you for playing, enjoy your day!");
        gameInSession = false;
        player.placeBet((-1));
    }
}