public double slopeTo(Point that) {
    if (((that.y) == (this.y)) && ((that.x) == (this.x)))
        return java.lang.Double.NEGATIVE_INFINITY;
    
    if ((that.x) == (this.x))
        return java.lang.Double.POSITIVE_INFINITY;
    
    return (((double) ((that.y) - (this.y))) / ((that.x) - (this.x))) + 0.0;
}