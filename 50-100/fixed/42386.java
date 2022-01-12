@java.lang.Override
public void setImageFileName(final java.lang.String filename) {
    super.setImageFileName(filename);
    for (int i = 0; i < (geoList.size()); i++) {
        final geogebra.common.kernel.geos.GeoElement geo = geoList.get(i);
        if (!(geo.isLabelSet())) {
            geo.setImageFileName(filename);
        }
    }
}