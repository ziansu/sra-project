@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(com.solderbyte.openfit.NotificationService.LOG_TAG, "Stopping Service");
    unregisterReceiver(appsReceiver);
    unregisterReceiver(stopServiceReceiver);
    stopSelf();
}