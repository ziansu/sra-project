public double slopeTo(Point that) {
    if ((this.compareTo(that)) == 0) {
        return java.lang.Double.NEGATIVE_INFINITY;
    }
    if ((this.x) == (that.x)) {
        return java.lang.Double.POSITIVE_INFINITY;
    }
    if ((this.y) == (that.y)) {
        return 0;
    }
    return ((double) ((that.y) - (this.y))) / ((that.x) - (this.x));
}