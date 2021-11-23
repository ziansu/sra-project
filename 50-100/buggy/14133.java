private void addGpsTagsForSelectedElement(com.spatialdev.osm.model.OSMElement selectedElement) {
    com.mapbox.mapboxsdk.geometry.LatLng userPos = getUserLocation();
    selectedElement.addOrEditTag(org.redcross.openmapkit.MapActivity.USER_LAT, java.lang.Double.toString(userPos.getLatitude()));
    selectedElement.addOrEditTag(org.redcross.openmapkit.MapActivity.USER_LNG, java.lang.Double.toString(userPos.getLongitude()));
    selectedElement.addOrEditTag(org.redcross.openmapkit.MapActivity.USER_ALT, java.lang.Double.toString(userPos.getAltitude()));
    selectedElement.addOrEditTag(org.redcross.openmapkit.MapActivity.GPS_ACCURACY, java.lang.Double.toString(mapView.getAccuracy()));
}