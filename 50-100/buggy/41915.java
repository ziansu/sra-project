public void centerMapOnLocation() {
    try {
        android.location.LocationManager locationManager = ((android.location.LocationManager) (getActivity().getSystemService(Context.LOCATION_SERVICE)));
        java.lang.String locationProvider = android.location.LocationManager.NETWORK_PROVIDER;
        mLastLocation = locationManager.getLastKnownLocation(locationProvider);
    } catch (java.lang.SecurityException e) {
        android.util.Log.w(com.mmm.parq.fragments.DriverHomeFragment.TAG, "Don't have permission to access location.");
    }
    mMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude()), 15));
}