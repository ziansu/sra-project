@java.lang.Override
public java.awt.geom.Rectangle2D getBounds2D() {
    if ((bounds) == null) {
        getBounds();
    }
    return bounds;
}