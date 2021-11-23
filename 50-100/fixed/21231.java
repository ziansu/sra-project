public static final java.awt.geom.Point2D.Double scaleTo(java.awt.geom.Point2D.Double p, double newLength) {
    double scaleFactor = newLength / (p.distance(0, 0));
    return new java.awt.geom.Point2D.Double(((p.x) * scaleFactor), ((p.y) * scaleFactor));
}