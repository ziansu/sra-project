@java.lang.Override
public void setBackgroundColor(final geogebra.common.awt.Color color) {
    super.setBackgroundColor(color);
    if (((geoList) == null) || ((geoList.size()) == 0)) {
        return ;
    }
    final int size = geoList.size();
    for (int i = 0; i < size; i++) {
        final geogebra.common.kernel.geos.GeoElement geo = get(i);
        if (!(geo.isLabelSet())) {
            geo.setBackgroundColor(color);
        }
    }
}