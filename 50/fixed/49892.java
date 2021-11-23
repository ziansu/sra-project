protected void createLocationRequest() {
    this.mLocationRequest = new com.google.android.gms.location.LocationRequest();
    this.mLocationRequest.setInterval(Constants.UPDATE_INTERVAL_IN_MILLISECONDS);
    this.mLocationRequest.setFastestInterval(Constants.FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS);
    this.mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
}