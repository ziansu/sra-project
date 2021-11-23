protected void showLocation(android.location.Location mCurrentLocation) {
    if (mCurrentLocation != null) {
        getNeabyMarkers(mCurrentLocation);
        mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude()), com.dev.cromer.jason.whatsappening.Activities.MapActivity.CAMERA_ZOOM));
    }
    com.google.android.gms.maps.model.LatLng center = mMap.getCameraPosition().target;
    mLastMarker = mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(center.latitude, center.longitude)).draggable(true));
}