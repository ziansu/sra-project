public boolean isOpen(int row, int col) {
    checkRowAndCol(row, col);
    int index = getIndex(row, col);
    return (opened[index]) != 0;
}