public void initPath() {
    path = new java.awt.geom.Path2D.Double();
    path.moveTo(latitudes.get(0), longtitudes.get(0));
    for (int i = 1; i < (latitudes.size()); ++i) {
        path.lineTo(latitudes.get(i), longtitudes.get(i));
    }
    path.closePath();
}