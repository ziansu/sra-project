private boolean canMove(int row, int col) {
    if (((row >= (board.length)) || (col >= (board.length))) || ((board[row][col]) != 0)) {
        return false;
    }else {
        debug(((java.lang.String) (board[row][col])));
        return true;
    }
}