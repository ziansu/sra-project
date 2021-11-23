public void onLocationChanged(android.location.Location location) {
    int lat = ((int) ((location.getLatitude()) * 1000000.0));
    int lng = ((int) ((location.getLongitude()) * 1000000.0));
    currentLoc = new com.google.android.maps.GeoPoint(lat, lng);
    refreshOverlay();
}