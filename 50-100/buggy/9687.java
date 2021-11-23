public void swap(int x1, int y1, int x2, int y2) {
    board.Cell temp = board[x1][y1];
    board[x1][y1] = board[x2][y2];
    board[x2][y2] = temp;
}