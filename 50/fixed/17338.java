@java.lang.Override
public void setCoordsB(java.awt.geom.Point2D p) {
    pointB = p;
    dispB = jmri.util.MathUtil.subtract(pointB, center);
}