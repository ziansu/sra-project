public void scaleBy(double scaleFactor, GeometryHelper.Vector center) {
    GeometryHelper.Vector newPoint;
    for (int i = 0; i < (points.size()); i++) {
        newPoint = points.get(i);
        newPoint.multiplyInPlace(scaleFactor);
    }
    newPoint = origin;
    newPoint.subtractInPlace(center);
    newPoint.multiplyInPlace(scaleFactor);
    newPoint.addInPlace(center);
}