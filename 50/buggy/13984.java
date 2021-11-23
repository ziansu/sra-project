protected void createLocationRequest() {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(treadsetters.bikesmart.LocationService.UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setFastestInterval(treadsetters.bikesmart.LocationService.FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    mLocationRequest.setSmallestDisplacement(2);
}