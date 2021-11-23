public static void checkForNullBoard() {
    if ((Puzzle.getInteractiveBoard()) == null) {
        java.lang.System.out.println("You have not set the board state yet.");
        java.lang.System.exit(0);
    }
}