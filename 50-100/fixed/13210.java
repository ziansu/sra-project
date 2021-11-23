private java.lang.Boolean containerCheck(int row, int column, int size) {
    int startRow = row / 3;
    int startColumn = column / 3;
    for (int r = startRow; r < (startRow + 3); r++) {
        for (int c = startColumn; c < (startColumn + 3); c++) {
            if ((values[r][c]) == size) {
                return true;
            }
        }
    }
    return false;
}