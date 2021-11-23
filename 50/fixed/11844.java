private static void clearNotifications(android.content.Context context) {
    android.app.NotificationManager manager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    manager.cancelAll();
}