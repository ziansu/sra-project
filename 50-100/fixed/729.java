@java.lang.Override
public void setLineThickness(final int thickness) {
    super.setLineThickness(thickness);
    if (((geoList) == null) || ((geoList.size()) == 0)) {
        return ;
    }
    for (int i = 0; i < (geoList.size()); i++) {
        final geogebra.common.kernel.geos.GeoElement geo = geoList.get(i);
        if (!(geo.isLabelSet())) {
            geo.setLineThickness(thickness);
        }
    }
}