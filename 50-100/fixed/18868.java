public edu.princeton.cs.algs4.Point2D nearest(edu.princeton.cs.algs4.Point2D p) {
    if (p == null) {
        throw new java.lang.NullPointerException();
    }
    edu.princeton.cs.algs4.Point2D closestPoint = null;
    double closestDistanceSquared = java.lang.Double.POSITIVE_INFINITY;
    for (edu.princeton.cs.algs4.Point2D point2D : points) {
        double distanceSquared = point2D.distanceSquaredTo(p);
        if (closestPoint != null) {
            if (distanceSquared < closestDistanceSquared) {
                closestPoint = point2D;
                closestDistanceSquared = distanceSquared;
            }
        }else {
            closestPoint = point2D;
            closestDistanceSquared = distanceSquared;
        }
    }
    return closestPoint;
}