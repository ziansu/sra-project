public double slopeTo(Point that) {
    if (((x) == (that.x)) && ((y) == (that.y)))
        return java.lang.Double.NEGATIVE_INFINITY;
    
    if ((x) == (that.x))
        return java.lang.Double.POSITIVE_INFINITY;
    
    if ((y) == (that.y))
        return 0;
    
    return ((that.y) - (y)) / ((double) ((that.x) - (x)));
}