public double distance(geogebra.common.kernel.geos.GeoPoint2 p) {
    double distance = java.lang.Double.POSITIVE_INFINITY;
    for (int i = 0; i < (geoList.size()); i++) {
        geogebra.common.kernel.geos.GeoElement geo = ((geogebra.common.kernel.geos.GeoElement) (geoList.get(i)));
        double d = geo.distance(p);
        if (d < distance) {
            distance = d;
        }
    }
    return distance;
}