private void initializeBoard(final int height, final int width) {
    board = new madsen.Cell[height][width];
    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            board[y][x] = new madsen.Cell();
        }
    }
}