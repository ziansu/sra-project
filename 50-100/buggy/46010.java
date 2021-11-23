public boolean isFull(int row, int col) {
    checkValidInput(row);
    checkValidInput(col);
    row = row - 1;
    col = col - 1;
    int index = getArrayIndex(row, col);
    if (wquf.connected(0, index)) {
        return true;
    }else {
        return false;
    }
}