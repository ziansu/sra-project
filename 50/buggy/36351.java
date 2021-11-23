public void setCell(int row, int column, boolean value) {
    row = fixRow(row);
    column = fixColumn(row, column);
    this.field[row][column] = value;
}