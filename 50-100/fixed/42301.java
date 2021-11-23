@java.lang.Override
public void setHatchingDistance(final int distance) {
    super.setHatchingDistance(distance);
    for (int i = 0; i < (geoList.size()); i++) {
        final geogebra.common.kernel.geos.GeoElement geo = geoList.get(i);
        if (!(geo.isLabelSet())) {
            geo.setHatchingDistance(distance);
        }
    }
}