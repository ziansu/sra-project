public void postNotification(int notificationId, android.support.v4.app.NotificationCompat.Builder builder) {
    android.app.Notification notification;
    if ((android.os.Build.VERSION.SDK_INT) >= (android.os.Build.VERSION_CODES.JELLY_BEAN))
        notification = builder.build();
    else
        notification = builder.getNotification();
    
    notificationManager.notify(notificationId, notification);
}