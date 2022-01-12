public void displayCurrentScore(com.dabney.Player player1, com.dabney.Player player2) {
    printNewLine(1);
    java.lang.System.out.println("Current Score:");
    printBars(1);
    java.lang.System.out.println(("Player 1 score: " + (player1.getWins())));
    if (player2 instanceof com.dabney.Computer)
        java.lang.System.out.println("Computer");
    else
        java.lang.System.out.println("Player 2");
    
    java.lang.System.out.printf(((" score: " + (player2.getWins())) + "\n"));
    printBars(1);
}