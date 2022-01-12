public int getPlayerCell(int row, int column) {
    if ((row >= 0) && (column >= 0)) {
        return playerMatrix[row][column];
    }
    return -1;
}