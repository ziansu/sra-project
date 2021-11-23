private int fixColumn(int row, int column) {
    if (column == (-1)) {
        column = (this.field[row].length) - 1;
    }
    if (column == (this.field[row].length)) {
        column = 0;
    }
    return column;
}