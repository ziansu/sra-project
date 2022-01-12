public void setDefined(final boolean flag) {
    isDefined = flag;
    if (!(isDefined)) {
        final int size = geoList.size();
        for (int i = 0; i < size; i++) {
            final geogebra.common.kernel.geos.GeoElement geo = geoList.get(i);
            if (!(geo.isLabelSet())) {
                geo.setUndefined();
            }
        }
    }
}