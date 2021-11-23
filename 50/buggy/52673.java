public boolean percolates() {
    return uf.connected(0, ((uf.count()) - 1));
}