private void addGeofences() {
    if (!(mGoogleApiClient.isConnected()))
        return ;
    
    try {
        LocationServices.GeofencingApi.addGeofences(mGoogleApiClient, getGeofencingRequest(), getGeofencePendingIntent()).setResultCallback(this);
    } catch (java.lang.SecurityException e) {
        e.printStackTrace();
    }
}