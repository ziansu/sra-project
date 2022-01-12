public static java.awt.geom.Point2D rotateRAD(double x, double y, double a) {
    double cosA = java.lang.Math.cos(a);
    double sinA = java.lang.Math.sin(a);
    return new java.awt.geom.Point2D.Double(((cosA * x) - (sinA * y)), ((sinA * x) + (cosA * y)));
}