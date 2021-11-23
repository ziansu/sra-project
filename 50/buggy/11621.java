private static void printAllPlayersResignedMessage() {
    java.lang.System.out.println("Game Over");
    java.lang.System.out.println((("The winner is " + (ConsoleUI.gameEngine.getCurrentPlayerName())) + " due to all other players resignment"));
    ConsoleUI.printGameStatistics();
    java.lang.System.out.println();
}