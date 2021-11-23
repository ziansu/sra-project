private int biggestEllipsoid(org.doube.geometry.Ellipsoid[] ellipsoids, double x, double y, double z) {
    final int l = ellipsoids.length;
    for (int i = 0; i < l; i++) {
        if (ellipsoids[i].contains(x, y, z))
            return ellipsoids[i].id;
        
    }
    return -1;
}