public double slopeTo(Point that) {
    if ((this.compareTo(that)) == 0)
        return java.lang.Double.NEGATIVE_INFINITY;
    
    if ((this.y) == (that.y))
        return java.lang.Double.POSITIVE_INFINITY;
    
    return ((double) ((that.y) - (this.y))) / ((double) ((that.x) - (this.x)));
}