@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.os.Bundle bundle = intent.getExtras();
    notificationManager.showTestNotification(bundle.getString(GCMReceiver.GCM_EXTRA_TITLE), bundle.getString(GCMReceiver.GCM_EXTRA_SERVER_TIME), bundle.getInt(GCMReceiver.GCM_EXTRA_PRIORITIZATION));
    android.content.Intent successIntent = new android.content.Intent(com.firstrowria.pushnotificationtester.activities.MainActivity.BROADCAST_ACTION_NOTIFICATION_SHOWN);
    successIntent.putExtra(MainActivity.BROADCAST_SUCCESS, true);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcastSync(successIntent);
    android.util.Log.d(MainActivity.TAG, "Notification shown and service stop requested");
    stopSelf();
    return START_STICKY;
}