private boolean isInDnD() {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getSystemService(com.jpollard.locationprofiles.NOTIFICATION_SERVICE)));
    int notificationLevel = notificationManager.getCurrentInterruptionFilter();
    android.util.Log.d(com.jpollard.locationprofiles.SettingsUpdateService.TAG, ("isInDnD: current interruption filter level: " + notificationLevel));
    return notificationLevel != (android.app.NotificationManager.INTERRUPTION_FILTER_ALL);
}