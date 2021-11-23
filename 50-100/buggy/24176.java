public boolean percolates() {
    for (int i = 1; i < ((grid) + 1); i++) {
        if ((isOpen(grid, i)) && (isFull(grid, i))) {
            return true;
        }
    }
    return false;
}