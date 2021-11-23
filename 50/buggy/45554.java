public boolean percolates() {
    return uf.connected(((count) * (count)), (((count) * (count)) + 1));
}