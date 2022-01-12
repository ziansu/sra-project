private void validateLocation(int row, int col) {
    if ((((row < 0) || (row >= (numRows()))) || (col < 0)) || (row > (numCols()))) {
        throw new cellsociety.CAException(cellsociety.CAException.INVALID_LOCATION);
    }
}