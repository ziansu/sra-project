public synchronized void enable(android.os.Handler locationHandler) {
    buildGoogleApiClient();
    if ((!(mGoogleApiClient.isConnected())) && (!(mGoogleApiClient.isConnecting()))) {
        mGoogleApiClient.connect();
    }
    if (!(isEnabled)) {
        mLocationRequest = new com.google.android.gms.location.LocationRequest();
        mLocationRequest.setInterval(com.jstakun.gms.android.location.GmsLocationServicesManager.LOCATION_READ_INTERVAL);
        mLocationRequest.setFastestInterval(com.jstakun.gms.android.location.GmsLocationServicesManager.LOCATION_READ_INTERVAL);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        isEnabled = true;
    }
    mLocationHandler = locationHandler;
}