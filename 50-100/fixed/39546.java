void redrawWaypoints() {
    if ((polyline) != null) {
        polyline.remove();
    }
    com.google.android.gms.maps.model.PolylineOptions options = new com.google.android.gms.maps.model.PolylineOptions().color(Color.RED);
    for (com.google.android.gms.maps.model.LatLng latLng : waypointStore.getWaypoints()) {
        options.add(latLng);
    }
    polyline = theMap.addPolyline(options);
    polyline.setZIndex(1000);
}