private boolean isTop(int x) {
    this.validSquareIndex(x);
    if (x <= (this.n)) {
        this.wquf.union(0, x);
        return true;
    }
    return false;
}