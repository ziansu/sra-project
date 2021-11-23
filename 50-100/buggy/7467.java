public boolean isSafe(int row, int col) {
    if ((((row < ((rows) - 3)) && (col < ((cols) - 3))) && (row >= 0)) && (col >= 0)) {
        return true;
    }
    return false;
}