public double slopeTo(Point that) {
    double rise = (this.y) - (that.y);
    double run = (this.x) - (that.x);
    if ((rise == 0) && (run != 0)) {
        return +0.0;
    }
    if (run == 0) {
        if (rise >= 0)
            return java.lang.Double.POSITIVE_INFINITY;
        else
            if (rise < 0)
                return java.lang.Double.NEGATIVE_INFINITY;
            
        
    }
    double slope = rise / run;
    return slope;
}