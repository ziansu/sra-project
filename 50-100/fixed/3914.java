public double slopeTo(Point that) {
    double rise = (that.y) - (y);
    double run = (that.x) - (x);
    if (run == 0) {
        if (rise == 0) {
            return java.lang.Double.NEGATIVE_INFINITY;
        }
        return java.lang.Double.POSITIVE_INFINITY;
    }
    if (rise == (-0)) {
        return 0;
    }
    return rise / run;
}