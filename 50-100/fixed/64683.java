public int[] getWhiteQueens() {
    int[] whiteQueens = new int[4];
    int counter = 0;
    for (int i = 0; i < (board.length); i++) {
        if ((board[i]) == (gameBoard.Board.WHITEQUEEN)) {
            whiteQueens[counter] = i;
            counter++;
        }
    }
    return whiteQueens;
}