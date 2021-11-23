protected int getInnerDimension(int row, int col) {
    return row - (((getColumnDimension()) - 1) - col);
}