public boolean percolates() {
    for (int j = 0; j < (sideSize); j++) {
        if (isFull(((sideSize) - 1), j)) {
            return true;
        }
    }
    return false;
}