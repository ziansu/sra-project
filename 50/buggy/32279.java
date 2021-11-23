public void removeNotification(android.content.Context context) {
    android.util.Log.i("Player Service", "removeNotification");
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(org.oucho.radio2.PlayerService.NOTIFY_ID);
}