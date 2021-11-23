public geometry.geom2d.Point2D getScreenCoord(geometry.geom3d.Point3D screenCoord) {
    return view.math.Translator.toPoint3D(screenCoord).get2D();
}