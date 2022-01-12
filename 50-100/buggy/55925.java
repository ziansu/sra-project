@java.lang.Override
public void onMyLocationChange(android.location.Location location) {
    if (!(mAnimatedToMyPosition)) {
        com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude()), 16);
        mMap.moveCamera(cameraUpdate);
        mAnimatedToMyPosition = true;
        mMap.setOnMyLocationChangeListener(null);
    }
}