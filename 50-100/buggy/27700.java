public void playMultipleRounds(int numberOfRounds) {
    if (displayMessage) {
        java.lang.System.out.println("Welcome to the sticks game!");
    }
    for (int round = 1; round <= numberOfRounds; round++) {
        currentPlayer = player1;
        board = new Board();
        playGame();
    }
    java.lang.System.out.println(((("The results are " + (getPlayerScore(1))) + (Competition.DOTS)) + (getPlayerScore(2))));
}