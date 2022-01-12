public madsen.Cell getCell(final int y, final int x) {
    madsen.Cell c = null;
    if ((((0 <= x) && (x < (boardWidth))) && (0 <= y)) && (y < (boardHeight))) {
        c = board[y][x];
    }
    return c;
}