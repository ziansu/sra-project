public boolean percolates() {
    for (int i = 0; i < (site[((site[0].length) - 1)].length); i++) {
        if (isFull(((site[0].length) - 1), i))
            return true;
        
    }
    return false;
}