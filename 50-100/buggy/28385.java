public double slopeTo(Point that) {
    int dy = (that.y) - (this.y);
    int dx = (that.x) - (this.x);
    if (dx == 0) {
        return dy == 0 ? java.lang.Double.NEGATIVE_INFINITY : java.lang.Double.POSITIVE_INFINITY;
    }else
        if (dy == 0) {
            return 0.0;
        }
    
    return ((double) (dy)) / dx;
}