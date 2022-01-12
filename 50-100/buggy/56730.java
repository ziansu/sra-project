public void buildNotification(android.content.Context ctx) {
    android.content.Intent notificationIntent = new android.content.Intent(ctx, com.example.oscar.radio.MainActivity.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getActivity(ctx, 0, notificationIntent, 0);
    notifBuilder = ((android.support.v7.app.NotificationCompat.Builder) (new android.support.v7.app.NotificationCompat.Builder(ctx).setContentTitle(musicTitle).setContentText(musicDesc).setSmallIcon(R.drawable.ic_play).setContentIntent(pendingIntent)));
    rPlayerService.startForeground(NOTIFICATION_ID, notifBuilder.build());
}