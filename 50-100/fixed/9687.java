public void swap(int x1, int y1, int x2, int y2) {
    board.Cell temp = board[y1][x1];
    board[y1][x1] = board[y2][x2];
    board[y2][x2] = temp;
}