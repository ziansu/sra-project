public static java.awt.geom.Point2D getCenter(java.util.Collection<java.awt.geom.Point2D> points) {
    double x = 0.0;
    double y = 0.0;
    for (java.awt.geom.Point2D p : points) {
        if (p == null) {
            return null;
        }
        x += p.getX();
        y += p.getY();
    }
    x /= points.size();
    y /= points.size();
    return new java.awt.geom.Point2D.Double(x, y);
}