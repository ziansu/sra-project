public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.app.Notification.Builder notificationBuilder = new android.app.Notification.Builder(context).setSmallIcon(android.R.drawable.stat_sys_warning).setAutoCancel(true).setContentTitle("Novas notícias estão disponíveis!").setContentText("Clique aqui para acessar sua lista de notícias e manter-se informado").setVibrate(mVibratePattern);
    android.app.NotificationManager mNotificationManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
    mNotificationManager.notify(1, notificationBuilder.build());
}