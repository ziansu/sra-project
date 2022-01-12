private void showLocationByLatLng(java.lang.String location, com.google.android.gms.maps.model.LatLng latLng) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) == 0) {
        android.location.Location curloc = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        com.google.android.gms.maps.model.LatLng curLatlng = new com.google.android.gms.maps.model.LatLng(curloc.getLatitude(), curloc.getLongitude());
        showNearbyPlaces(new com.google.android.gms.maps.model.LatLngBounds(latLng, curLatlng));
        updateMapView(latLng);
        showDistance(location, curLatlng, latLng);
    }
}