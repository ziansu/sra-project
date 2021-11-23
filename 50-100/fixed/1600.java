private void removeQueen(int row, int col) {
    if ((row >= (board.length)) || (col >= (board.length))) {
        throw new java.lang.IllegalArgumentException("Invalid row/column to remove a queen!");
    }
    if ((board[row][col]) != (-1)) {
        throw new java.lang.IllegalArgumentException("There is no queen there!");
    }
    board[row][col] = 0;
    (numQueens)--;
    markDangerAreas(row, col, (-1));
}