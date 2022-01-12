public int fixRow(int row) {
    if (row < 0) {
        row = (this.field.length) + row;
    }
    if (row > ((this.field.length) - 1)) {
        row -= this.field.length;
    }
    return row;
}