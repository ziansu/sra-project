public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    if (p == null)
        throw new java.lang.NullPointerException("");
    
    edu.princeton.cs.algs4.Point2D nearest = null;
    double distance = java.lang.Double.MAX_VALUE;
    for (edu.princeton.cs.algs4.Point2D point : pointset) {
        double temp = point.distanceSquaredTo(p);
        if (temp < distance) {
            if (temp > 0) {
                distance = temp;
                nearest = point;
            }
        }
    }
    return nearest;
}