private int fixRow(int row) {
    if (row == (-1)) {
        row = (this.field.length) - 1;
    }
    if (row == (this.field.length)) {
        row = 0;
    }
    return row;
}