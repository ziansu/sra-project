public void followCurrentPosition(float zoom) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this.getContext(), android.Manifest.permission.ACCESS_FINE_LOCATION)) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mLastKnownLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
        android.util.Log.d("getlastlocation", "1");
        if ((mLastKnownLocation) != null) {
            android.util.Log.d("getlastlocation", "2");
            mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(mLastKnownLocation.getLatitude(), mLastKnownLocation.getLongitude()), zoom));
        }
    }
}