public void printBoard() {
    for (int i = 0; i < (board.length); i++) {
        for (int j = 0; j < (board[i].length); j++) {
            java.lang.System.out.print(((board[i][j]) + " "));
        }
        java.lang.System.out.println();
    }
}