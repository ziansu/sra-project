private boolean withinRegularBoard(int row, int col) {
    if ((((row < 0) || (row > 3)) || (col < 0)) || (col > 2)) {
        return false;
    }
    return true;
}