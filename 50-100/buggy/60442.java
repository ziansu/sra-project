public static void cancelScheduledNotifications(android.content.Context context) {
    android.app.PendingIntent risePendingIntent = net.chokethe.killerdealer.notifications.NotificationUtils.getPendingIntent(context, NotificationPublisher.RISE_NOTIFICATION_ACTION, 0);
    android.app.PendingIntent rebuyPendingIntent = net.chokethe.killerdealer.notifications.NotificationUtils.getPendingIntent(context, NotificationPublisher.REBUY_NOTIFICATION_ACTION, 0);
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    alarmManager.cancel(risePendingIntent);
    alarmManager.cancel(rebuyPendingIntent);
    net.chokethe.killerdealer.notifications.NotificationPublisher.cancelNotifications(context);
}