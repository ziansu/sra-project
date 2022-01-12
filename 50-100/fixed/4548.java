private void updateMap() {
    cLong += 1.0E-4;
    cLat += 1.0E-4;
    double longitude = java.lang.Double.parseDouble(Stats.longitude);
    double lat = java.lang.Double.parseDouble(Stats.latitude);
    if ((longitude != 0) && (lat != 0))
        currLoc = new org.jxmapviewer.viewer.GeoPosition(lat, longitude);
    else
        currLoc = new org.jxmapviewer.viewer.GeoPosition(cLat, cLong);
    
    smm.update(currLoc);
    mapViewer.setAddressLocation(currLoc);
}