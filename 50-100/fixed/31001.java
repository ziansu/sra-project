@java.lang.Override
public void setEuclidianVisible(final boolean visible) {
    super.setEuclidianVisible(visible);
    if (((geoList) == null) || ((geoList.size()) == 0)) {
        return ;
    }
    final int size = geoList.size();
    for (int i = 0; i < size; i++) {
        final geogebra.common.kernel.geos.GeoElement geo = get(i);
        geogebra.common.kernel.geos.GeoList.setElementEuclidianVisible(geo, visible);
    }
}