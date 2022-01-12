@java.lang.Override
public boolean onMyLocationButtonClick() {
    android.location.Location newLocation = mLocationCallback.getCurrentLocation();
    if (newLocation != null) {
        com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(newLocation.getLatitude(), newLocation.getLongitude());
        mGoogleMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(latLng));
        addMarker(mGoogleMap, latLng);
    }
    return true;
}