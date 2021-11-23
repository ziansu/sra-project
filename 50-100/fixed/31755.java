public int fixColumn(int column) {
    if (column < 0) {
        column = (this.field[0].length) + column;
    }
    if (column > ((this.field[0].length) - 1)) {
        column -= this.field[0].length;
    }
    return column;
}