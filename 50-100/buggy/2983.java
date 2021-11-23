public void centerOnGasStations(java.util.List<com.google.android.gms.maps.model.LatLng> listLatLng) {
    com.google.android.gms.maps.model.LatLngBounds.Builder bounds = new com.google.android.gms.maps.model.LatLngBounds.Builder();
    for (com.google.android.gms.maps.model.LatLng latLng : listLatLng) {
        bounds.include(latLng);
    }
    mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(bounds.build(), 200));
}