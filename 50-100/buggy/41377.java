private int getScore(int y, int x, char[][] board) {
    board[y][x] = this.player;
    if (this.checkIfICanWin(y, x, board)) {
        board[y][x] = ' ';
        return 10;
    }
    if (this.checkIfOtherCanWin(y, x, board)) {
        board[y][x] = ' ';
        return 5;
    }
    board[y][x] = ' ';
    return 0;
}