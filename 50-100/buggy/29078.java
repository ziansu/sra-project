public boolean isEqual(geogebra.common.kernel.geos.GeoElement geo) {
    if ((geo.isGeoRay()) || (geo.isGeoSegment()))
        return false;
    
    if (geo.isGeoLine())
        return linDep(((geogebra.common.kernel.geos.GeoLine) (geo)));
    else
        return false;
    
}