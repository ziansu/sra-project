public double slopeTo(Point that) {
    int dy = (that.y) - (this.y);
    int dx = (that.x) - (this.x);
    if (dx == 0) {
        if (dy == 0) {
            return java.lang.Double.NEGATIVE_INFINITY;
        }else {
            return java.lang.Double.POSITIVE_INFINITY;
        }
    }else
        if (dy == 0) {
            return 0.0;
        }
    
    return ((double) (dy)) / dx;
}