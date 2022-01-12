public void scaleBy(double scaleFactor, GeometryHelper.Vector center) {
    for (int i = 0; i < (points.size()); i++) {
        points.get(i).multiplyInPlace(scaleFactor);
    }
    origin.multiplyInPlace(scaleFactor);
}