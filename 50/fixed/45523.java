private void removeAllGeofences() {
    LocationServices.GeofencingApi.removeGeofences(googleApiClient, getGeofencePendingIntent()).setResultCallback(this);
}