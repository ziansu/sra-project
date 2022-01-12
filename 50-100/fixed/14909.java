public void endGame() {
    java.lang.System.out.println("You lost. You must suck at life");
    java.lang.String playAgain;
    do {
        java.lang.System.out.println("Would you like to play again: [y/n]");
        playAgain = CheckString();
    } while ((!(playAgain.equalsIgnoreCase("y"))) && (!(playAgain.equalsIgnoreCase("n"))) );
    if (playAgain.equalsIgnoreCase("y")) {
        startGame();
    }else {
        java.lang.System.out.println("Goodbye");
        java.lang.System.exit(0);
    }
}