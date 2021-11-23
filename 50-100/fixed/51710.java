public void initPath() {
    path = new java.awt.geom.Path2D.Double();
    path.moveTo(longtitudes.get(0), latitudes.get(0));
    for (int i = 1; i < (latitudes.size()); ++i) {
        path.lineTo(longtitudes.get(i), latitudes.get(i));
    }
    path.closePath();
}