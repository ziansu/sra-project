private int getScore(int y, int x, char[][] board) {
    if (this.checkIfICanWin(y, x, board)) {
        board[y][x] = ' ';
        return 5;
    }
    if (this.checkIfOtherCanWin(y, x, board)) {
        board[y][x] = ' ';
        return 10;
    }
    board[y][x] = ' ';
    return 0;
}