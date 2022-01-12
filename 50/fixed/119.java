private com.google.android.gms.location.LocationRequest createLocationRequest(long interval) {
    com.google.android.gms.location.LocationRequest locationRequest = new com.google.android.gms.location.LocationRequest();
    locationRequest.setInterval(interval);
    locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    return locationRequest;
}