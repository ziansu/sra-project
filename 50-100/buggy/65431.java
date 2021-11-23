public double slopeTo(Point that) {
    if ((this) == that)
        return java.lang.Double.NEGATIVE_INFINITY;
    
    if ((this.y) == (that.y))
        return java.lang.Double.POSITIVE_INFINITY;
    
    return ((that.y) - (this.y)) / ((that.x) - (this.x));
}