@java.lang.Override
public void setLineThickness(int thickness) {
    super.setLineThickness(thickness);
    if (((geoList) == null) || ((geoList.size()) == 0))
        return ;
    
    for (int i = 0; i < (geoList.size()); i++) {
        geogebra.common.kernel.geos.GeoElement geo = ((geogebra.common.kernel.geos.GeoElement) (geoList.get(i)));
        if (!(geo.isLabelSet()))
            geo.setLineThickness(thickness);
        
    }
}