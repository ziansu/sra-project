public void followCurrentPosition(float zoom) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this.getContext(), android.Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mLastKnownLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        if ((mLastKnownLocation) != null) {
            mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(mLastKnownLocation.getLatitude(), mLastKnownLocation.getLongitude()), zoom));
        }
    }
}