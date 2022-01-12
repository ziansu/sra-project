private boolean validCoordinates(final int row, final int col) {
    return !((((row < 0) || (col < 0)) || (row >= (board.length))) || (col >= (board.length)));
}