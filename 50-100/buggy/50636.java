private void addOrUpdateMarkers(rectangledbmi.com.pittsburghrealtimetracker.world.jsonpojo.Vehicle vehicle, java.util.Set<java.lang.Integer> routesOnMap) {
    int vid = vehicle.getVid();
    com.google.android.gms.maps.model.Marker marker = busMarkers.get(vid);
    if (marker == null) {
        addMarker(vehicle);
    }else {
        routesOnMap.remove(vid);
        updateMarker(vehicle, marker);
    }
}