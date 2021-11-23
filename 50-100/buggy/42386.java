@java.lang.Override
public void setImageFileName(java.lang.String filename) {
    super.setImageFileName(filename);
    for (int i = 0; i < (geoList.size()); i++) {
        geogebra.common.kernel.geos.GeoElement geo = ((geogebra.common.kernel.geos.GeoElement) (geoList.get(i)));
        if (!(geo.isLabelSet()))
            geo.setImageFileName(filename);
        
    }
}