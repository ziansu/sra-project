public double slopeTo(Point that) {
    if (((x) == (that.x)) && ((y) == (that.y)))
        return java.lang.Double.NEGATIVE_INFINITY;
    
    if ((x) == (that.x))
        return java.lang.Double.POSITIVE_INFINITY;
    
    return ((that.y) - (y)) / ((that.x) - (x));
}