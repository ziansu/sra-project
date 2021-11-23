private boolean validCoordinates(final int row, final int col) {
    if ((((row < 0) || (col < 0)) || (row >= (board.length))) || (col >= (board.length))) {
        return false;
    }else {
        return true;
    }
}