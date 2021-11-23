@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.notify(ben.avgmovies.notifications.NotificationPublisher.NOT_OD, getNotification(context));
}