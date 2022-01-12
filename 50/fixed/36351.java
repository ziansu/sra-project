public void setCell(int row, int column, boolean value) {
    this.field[fixRow(row)][fixColumn(column)] = value;
}