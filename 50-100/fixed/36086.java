@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.System.out.println("neutral receiver activated");
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(MainActivity.FEEDBACK_NOTIFICATION_ID);
    android.support.v4.app.NotificationCompat.Builder mBuilder = new android.support.v4.app.NotificationCompat.Builder(context).setContentTitle("Thanks!").setContentText("We appreciate your feedback.").setSmallIcon(R.mipmap.ic_launcher).setAutoCancel(true).setPriority(Notification.PRIORITY_MAX);
    notificationManager.notify(((MainActivity.FEEDBACK_NOTIFICATION_ID) + 1), mBuilder.build());
}