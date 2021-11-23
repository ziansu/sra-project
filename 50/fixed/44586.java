public boolean percolates() {
    return quickUnionHelper.connected(0, (((size) * (size)) + 1));
}