public closestPair.XyList left() {
    java.util.List<java.awt.geom.Point2D> newXLx = new java.util.ArrayList<java.awt.geom.Point2D>();
    java.util.List<java.awt.geom.Point2D> newXLy = new java.util.ArrayList<java.awt.geom.Point2D>();
    newXLx.addAll(xList.subList(0, ((xList.size()) / 2)));
    newXLy.addAll(xList.subList(0, ((yList.size()) / 2)));
    return new closestPair.XyList(newXLx, newXLy);
}