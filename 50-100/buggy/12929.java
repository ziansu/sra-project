public double slopeTo(Point that) {
    if ((this.compareTo(that)) == 0)
        return java.lang.Double.NEGATIVE_INFINITY;
    
    if ((this.x) == (that.x))
        return java.lang.Double.POSITIVE_INFINITY;
    
    return ((double) ((this.y) - (that.y))) / ((double) ((this.x) - (that.x)));
}