private void setUpMap() {
    mMap.setMyLocationEnabled(true);
    mMap.setOnInfoWindowClickListener(new com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener() {
        @java.lang.Override
        public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
            java.lang.String phoneNumber = marker.getSnippet();
            MainActivity.bus.post(new com.ocr.labinal.events.MarkerClickedEvent(phoneNumber));
        }
    });
    mMap.setOnMapLoadedCallback(new com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback() {
        @java.lang.Override
        public void onMapLoaded() {
            mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(mBounds, 100));
        }
    });
}