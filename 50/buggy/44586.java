public boolean percolates() {
    return quickUnionHelper.connected(0, (((N) * (N)) + 1));
}