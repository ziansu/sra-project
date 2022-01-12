protected void AddGeofenceHandler() {
    if (!(mGoogleApiClient.isConnected())) {
        android.widget.Toast.makeText(this, "Not Connected", Toast.LENGTH_SHORT).show();
        return ;
    }
    try {
        LocationServices.GeofencingApi.addGeofences(mGoogleApiClient, getGeofencingRequest(), getPendingIntent()).setResultCallback(this);
    } catch (java.lang.SecurityException securityException) {
    }
}