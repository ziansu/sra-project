@java.lang.Override
public double distance(final geogebra.common.kernel.geos.GeoPoint2 p) {
    double distance = java.lang.Double.POSITIVE_INFINITY;
    for (int i = 0; i < (geoList.size()); i++) {
        final geogebra.common.kernel.geos.GeoElement geo = geoList.get(i);
        final double d = geo.distance(p);
        if (d < distance) {
            distance = d;
        }
    }
    return distance;
}