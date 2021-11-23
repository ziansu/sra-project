private java.lang.Boolean containerCheck(int row, int column, int size) {
    int startRow = containerRow(row);
    int startColumn = containerColumn(column);
    for (int r = startRow; r < (startRow + 3); r++) {
        for (int c = startColumn; c < (startColumn + 3); c++) {
            if ((values[r][c]) == size) {
                return true;
            }
        }
    }
    return false;
}