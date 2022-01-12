public boolean getCell(int row, int column) {
    row = fixRow(row);
    column = fixColumn(row, column);
    return this.field[row][column];
}