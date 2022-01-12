public static java.awt.geom.Rectangle2D scale(java.awt.geom.Rectangle2D r, double s) {
    java.awt.geom.Point2D c = jmri.util.MathUtil.center(r);
    double w = (r.getWidth()) * s;
    double h = (r.getHeight()) * s;
    return new java.awt.geom.Rectangle2D.Double(((c.getX()) - (w / 2)), ((c.getY()) - (h / 2)), w, h);
}