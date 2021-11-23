private void addOrUpdateMarkers(rectangledbmi.com.pittsburghrealtimetracker.world.jsonpojo.Vehicle vehicle) {
    int vid = vehicle.getVid();
    com.google.android.gms.maps.model.Marker marker = busMarkers.get(vid);
    if (marker == null) {
        addMarker(vehicle);
    }else {
        updateMarker(vehicle, marker);
    }
}