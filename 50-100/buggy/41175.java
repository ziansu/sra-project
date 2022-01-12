public boolean intersectsRectangle(org.hwyl.sexytopo.model.graph.Coord2D rectangleTopLeft, org.hwyl.sexytopo.model.graph.Coord2D rectangleBottomRight) {
    double left1 = rectangleTopLeft.getX();
    double top1 = rectangleTopLeft.getY();
    double right1 = rectangleBottomRight.getX();
    double bottom1 = rectangleBottomRight.getY();
    return (((right) >= left1) && ((left) <= right1)) && (((top) >= bottom1) && ((bottom) <= top1));
}