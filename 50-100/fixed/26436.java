@java.lang.Override
public org.openstreetmap.josm.gui.mappaint.styleelement.placement.PositionForAreaStrategy withAddedOffset(java.awt.geom.Point2D addToOffset) {
    if (((java.lang.Math.abs(addToOffset.getX())) < 1.0E-5) && ((java.lang.Math.abs(addToOffset.getY())) < 1.0E-5)) {
        return this;
    }else {
        return new org.openstreetmap.josm.gui.mappaint.styleelement.placement.CompletelyInsideAreaStrategy(((offsetX) + (addToOffset.getX())), ((offsetY) - (addToOffset.getY())));
    }
}