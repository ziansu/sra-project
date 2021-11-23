public void onError(java.lang.Exception e) {
    if (!(running))
        return ;
    
    if (syncForced) {
        syncForced = false;
        android.widget.Toast.makeText(getApplicationContext(), "Error syncing with Database", Toast.LENGTH_SHORT).show();
    }
    org.frc836.database.DBSyncService.syncInProgress = false;
    updateNotificationText(getString(R.string.service_notify_text));
    mTimerTask.postDelayed(dataTask, org.growingstems.scouting.Prefs.getMilliSecondsBetweenSyncs(getApplicationContext(), org.frc836.database.DBSyncService.DELAY));
    if ((callback) != null)
        callback.onFinish();
    
    callback = null;
}