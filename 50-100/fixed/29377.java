@java.lang.Override
protected void onPushReceive(android.content.Context context, android.content.Intent intent) {
    if (github.taivo.parsepushplugin.ParsePushPlugin.isInForeground()) {
        github.taivo.parsepushplugin.ParsePushPlugin.jsCallback(github.taivo.parsepushplugin.ParsePushPluginReceiver.getPushData(intent));
    }else {
        android.app.NotificationManager notifManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
        notifManager.notify(github.taivo.parsepushplugin.ParsePushPluginReceiver.getNotificationTag(context, intent), 0, getNotification(context, intent));
    }
}