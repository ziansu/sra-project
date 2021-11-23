public double slopeTo(Point that) {
    if (that == null) {
        throw new java.lang.NullPointerException();
    }
    double rise = (that.y) - (this.y);
    double run = (that.x) - (this.x);
    if (run == 0) {
        if (rise == 0)
            return java.lang.Double.NEGATIVE_INFINITY;
        else
            return java.lang.Double.POSITIVE_INFINITY;
        
    }
    if (rise == 0) {
        return +0.0;
    }
    double slope = rise / run;
    return slope;
}