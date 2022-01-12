public boolean percolates() {
    for (int i = 0; i < (site[site[0].length].length); i++) {
        if (isFull(9, i))
            return true;
        
    }
    return false;
}