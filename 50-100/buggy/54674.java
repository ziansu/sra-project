public void display(com.google.android.gms.maps.GoogleMap map) {
    marker = map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.ic_select_geofence)).position(geofenceView.latLng()).draggable(false));
    circle = map.addCircle(new com.google.android.gms.maps.model.CircleOptions().fillColor(android.R.attr.fillColor).strokeColor(android.R.attr.strokeColor).center(geofenceView.latLng()).radius(geofenceView.radius()));
}