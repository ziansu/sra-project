public void printBoard(boolean show) {
    for (int i = 0; i < (board.length); i++) {
        for (int j = 0; j < (board.length); j++) {
            MineSweeper.Square curr = board[i][j];
            java.lang.System.out.print((show || (curr.shown) ? board[i][j] : " "));
        }
        java.lang.System.out.println("");
    }
}