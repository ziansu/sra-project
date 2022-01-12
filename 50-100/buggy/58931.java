public void printBoard() {
    java.lang.System.out.println();
    for (int i = 0; i < (board.length); i++) {
        if (((i % 3) == 0) && (i != 0)) {
            java.lang.System.out.println();
            java.lang.System.out.println("-------------");
        }
        java.lang.System.out.println((" | " + (board[i])));
    }
    java.lang.System.out.println();
}