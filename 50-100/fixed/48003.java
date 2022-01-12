public static java.awt.geom.Rectangle2D scale(java.awt.geom.Rectangle2D r, double s) {
    return new java.awt.geom.Rectangle2D.Double(((r.getX()) * s), ((r.getY()) * s), ((r.getWidth()) * s), ((r.getHeight()) * s));
}