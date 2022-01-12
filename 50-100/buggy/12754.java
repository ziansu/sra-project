public void cancelNotification(int notificationId) {
    if ((android.content.Context.NOTIFICATION_SERVICE) != null) {
        java.lang.String ns = android.content.Context.NOTIFICATION_SERVICE;
        android.app.NotificationManager nMgr = ((android.app.NotificationManager) (getApplicationContext().getSystemService(ns)));
        nMgr.cancel(notificationId);
    }
}