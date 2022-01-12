private void showPausedNotification() {
    android.app.Notification.Builder builder = divyang.musicapp_v6.MediaStyleHelper.from(this, mediaSession, divyang.musicapp_v6.MainActivity.class, PAUSE_STATE);
    if (builder == null)
        return ;
    
    android.app.Notification notify = builder.build();
    notify.priority = android.app.Notification.PRIORITY_HIGH;
    android.app.NotificationManager notifyManage = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    stopForeground(false);
    notifyManage.notify(PAUSE_NOTIFICATION, notify);
}