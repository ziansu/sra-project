public boolean percolates() {
    for (int col = 1; col <= (rowLen); col++) {
        if (isFull(rowLen, col)) {
            return true;
        }
    }
    return false;
}