public java.lang.Boolean validXY(int x, int y) {
    return (((x >= 0) && (x < (board.length))) && ((y >= 0) && (y < (board[0].length)))) && ((board[x][y]) == 0);
}