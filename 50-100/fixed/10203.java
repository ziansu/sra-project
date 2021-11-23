public boolean removeGeofence(long id) {
    if (!(mGoogleApiClient.isConnected())) {
        android.util.Log.i(hk.ust.cse.comp4521.reminder.ReminderDataController.TAG, "Cannot connect to Google Service");
        return false;
    }
    android.content.Intent intent = new android.content.Intent(context, hk.ust.cse.comp4521.reminder.GeofenceTransitionIntentService.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getService(context, (((int) (id)) * 7), intent, PendingIntent.FLAG_NO_CREATE);
    if (pendingIntent == null)
        return true;
    
    LocationServices.GeofencingApi.removeGeofences(mGoogleApiClient, pendingIntent).setResultCallback(this);
    return true;
}