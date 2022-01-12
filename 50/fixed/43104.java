public boolean isFull(int row, int col) {
    return !(openSites[(row - 1)][(col - 1)]);
}