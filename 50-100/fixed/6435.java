public void showNotifications(android.content.Context context) {
    android.app.Notification.Builder notificationBuilder = new android.app.Notification.Builder(context).setTicker("Hej").setSmallIcon(android.R.drawable.stat_sys_warning).setAutoCancel(true).setContentTitle("Title").setContentText("Content text");
    android.app.NotificationManager mNotificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    mNotificationManager.notify(gruppe3.dtu02128.fridgeapp.FoodExpireBroadcastReceiver.MY_NOTIFICATION_ID, notificationBuilder.getNotification());
}