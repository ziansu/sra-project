private void handleNewLocation(android.location.Location location) {
    android.util.Log.d(com.example.blanche.orgevents.MapsActivity.TAG, location.toString());
    double currentLatitude = location.getLatitude();
    double currentLongitude = location.getLongitude();
    com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(currentLatitude, currentLongitude);
    mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng));
}