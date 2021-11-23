@java.lang.Override
public void setCoordsA(java.awt.geom.Point2D p) {
    pointA = p;
    dispC = jmri.util.MathUtil.subtract(pointA, center);
}