public void setDefined(boolean flag) {
    isDefined = flag;
    if (!(isDefined)) {
        int size = geoList.size();
        for (int i = 0; i < size; i++) {
            geogebra.common.kernel.geos.GeoElement geo = ((geogebra.common.kernel.geos.GeoElement) (geoList.get(i)));
            if (!(geo.isLabelSet()))
                geo.setUndefined();
            
        }
    }
}