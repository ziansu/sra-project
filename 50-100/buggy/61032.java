public void alertSentNotification(android.content.Context context) {
    android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context).setContentTitle(getString(R.string.app_name)).setSmallIcon(R.drawable.ic_falling).setContentText(getString(R.string.alertSent));
    java.lang.String notificationService = android.content.Context.NOTIFICATION_SERVICE;
    android.app.NotificationManager manager = ((android.app.NotificationManager) (context.getSystemService(notificationService)));
    manager.notify(Constants.NOTIFICATION_ID.FOREGROUND_SERVICE, builder.build());
}