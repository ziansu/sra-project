public boolean isFull(int i, int j) {
    int index = getIndex(i, j);
    for (int col = 0; col < (rowLen); col++) {
        int rowIndex = getIndex(0, col);
        if (uf.connected(index, rowIndex)) {
            return true;
        }
    }
    return false;
}