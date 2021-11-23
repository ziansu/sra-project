private void sendNotification(android.support.v4.app.NotificationCompat.Builder notificationBuilder) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.notify(id, notificationBuilder.build());
}