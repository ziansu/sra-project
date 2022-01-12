public void setForeground(boolean foreground) {
    if ((mForeground) != foreground) {
        android.util.Log.v(com.plugin.gcm.NotificationService.TAG, ((("setForeground() -> oldValue: " + (mForeground)) + " newValue: ") + foreground));
        final android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (mContext.getSystemService(Context.NOTIFICATION_SERVICE)));
        notificationManager.cancelAll();
    }
    mForeground = foreground;
}