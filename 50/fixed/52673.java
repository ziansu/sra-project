public boolean percolates() {
    return uf.connected(0, (((size) * (size)) + 1));
}