@java.lang.Override
public void setHatchingDistance(int distance) {
    super.setHatchingDistance(distance);
    for (int i = 0; i < (geoList.size()); i++) {
        geogebra.common.kernel.geos.GeoElement geo = ((geogebra.common.kernel.geos.GeoElement) (geoList.get(i)));
        if (!(geo.isLabelSet()))
            geo.setHatchingDistance(distance);
        
    }
}