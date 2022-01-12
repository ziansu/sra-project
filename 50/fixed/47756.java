@java.lang.Override
public java.awt.geom.Rectangle2D getBounds2D() {
    bounds = null;
    if ((bounds) == null) {
        getBounds();
    }
    return bounds;
}