public boolean isFull(int i, int j) {
    checkXYValidity(i, j);
    return qu.connected(xyTo1D(i, j), N);
}