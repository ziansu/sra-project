private void redrawPolyLines(java.util.ArrayList<com.google.android.gms.maps.model.LatLng> location_array) {
    com.google.android.gms.maps.model.LatLng prev_location = null;
    for (com.google.android.gms.maps.model.LatLng location : location_array) {
        if ((location != null) && (prev_location != null)) {
            mGoogleMap.addPolyline(new com.google.android.gms.maps.model.PolylineOptions().add(prev_location).add(location).width(10).color(Color.RED));
        }
        prev_location = location;
    }
    if (prev_location != null) {
        mGoogleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(prev_location, 16));
    }
}