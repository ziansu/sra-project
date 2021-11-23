@java.lang.Override
public void setCoordsB(java.awt.geom.Point2D p) {
    dispB = jmri.util.MathUtil.subtract(p, center);
    pointB = p;
}