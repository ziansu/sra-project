public boolean percolates() {
    return (uf.find(0)) == (uf.find(((N) + 1)));
}