private boolean canMove(int row, int col) {
    if ((((row >= (board.length)) || (col >= (board.length))) || (row < 0)) || (col < 0)) {
        return false;
    }else {
        return (board[row][col]) == 0;
    }
}