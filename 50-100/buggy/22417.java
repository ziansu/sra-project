public static java.awt.geom.Point2D middlePoint(java.util.Collection<java.awt.geom.Point2D> points) {
    double x = 0.0;
    double y = 0.0;
    int count = points.size();
    for (java.awt.geom.Point2D point : points) {
        x += point.getX();
        y += point.getY();
    }
    if (count > 0) {
        x /= count;
        y /= count;
    }
    return count > 0 ? new java.awt.geom.Point2D.Double((x / count), (y / count)) : null;
}