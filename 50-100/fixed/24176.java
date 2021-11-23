public boolean percolates() {
    for (int i = 0; i < (grid); i++) {
        if ((isOpen(grid, (i + 1))) && (isFull(grid, (i + 1)))) {
            return true;
        }
    }
    return false;
}