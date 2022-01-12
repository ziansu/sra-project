public void undoMove(int column) {
    int row = ((edu.frostburg.cosc591_connectx.Board.ROWS) - 1) - (size[column]);
    if (row == (-1)) {
        row = 0;
    }
    board[row][column] = null;
    --(size[column]);
    --(totalSize);
}