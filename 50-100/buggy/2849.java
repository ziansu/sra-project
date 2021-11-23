public boolean checkForWin(int row, int column, int grid) {
    if ((((checkRow(row, column, grid)) || (checkColumn(row, column, grid))) || (checkDiagonal(row, column, grid))) || (checkDiagOfAllGrids(row, column, grid))) {
        return true;
    }
    return false;
}