private static void clearNotifications() {
    android.app.NotificationManager manager = ((android.app.NotificationManager) (fforganizer.FFOrganizer.getInstance().getSystemService(Context.NOTIFICATION_SERVICE)));
    manager.cancelAll();
}