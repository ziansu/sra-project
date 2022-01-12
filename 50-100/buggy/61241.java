private void initializeBoard(final int height, final int width) {
    board = new madsen.Cell[height][width];
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            board[i][j] = new madsen.Cell();
        }
    }
}