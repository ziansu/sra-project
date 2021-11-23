private int ensureHorizontal(int x) {
    x = java.lang.Math.max(x, this.x);
    x = java.lang.Math.min(x, (x + (width)));
    return x;
}