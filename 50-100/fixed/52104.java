public static void printBoard(connectn.Board board) {
    byte[][] state = board.copyState();
    for (int y = (state[0].length) - 1; y >= 0; y--) {
        for (int x = 0; x < (state.length); x++) {
            java.lang.System.out.print(((state[x][y]) + " "));
        }
        java.lang.System.out.println();
    }
    java.lang.System.out.println();
}