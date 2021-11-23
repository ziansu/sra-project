@java.lang.Override
protected void onPushReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(github.taivo.parsepushplugin.ParsePushPluginReceiver.LOGTAG, ("onPushReceive - context: " + context));
    if (!(github.taivo.parsepushplugin.ParsePushPlugin.isInForeground())) {
        android.app.NotificationManager notifManager = ((android.app.NotificationManager) (context.getSystemService(Context.NOTIFICATION_SERVICE)));
        notifManager.notify(github.taivo.parsepushplugin.ParsePushPluginReceiver.getNotificationTag(context, intent), 0, getNotification(context, intent));
    }
    github.taivo.parsepushplugin.ParsePushPlugin.jsCallback(github.taivo.parsepushplugin.ParsePushPluginReceiver.getPushData(intent));
}