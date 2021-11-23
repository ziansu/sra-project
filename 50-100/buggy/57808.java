public static java.awt.geom.Point2D rotateRAD(java.awt.geom.Point2D p, double a) {
    double pX = p.getX();
    double pY = p.getY();
    double cosA = java.lang.Math.cos(a);
    double sinA = java.lang.Math.sin(a);
    return new java.awt.geom.Point2D.Double(((cosA * pX) - (sinA * pY)), ((sinA * pX) + (cosA * pY)));
}