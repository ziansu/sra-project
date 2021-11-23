@java.lang.Override
public java.awt.geom.Rectangle2D getBounds() {
    return new java.awt.geom.Rectangle2D.Double(((_maxX) - (_minX)), ((_maxY) - (_minY)), _minX, _minY);
}