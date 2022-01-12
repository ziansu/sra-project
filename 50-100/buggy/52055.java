@java.lang.Override
public void onDestroy() {
    org.md2k.utilities.Report.Log.d(org.md2k.notificationmanager.ServiceNotificationManager.TAG, "onDestroy()...");
    notificationManager.clear();
    if (((dataKitAPI) != null) && (dataKitAPI.isConnected()))
        dataKitAPI.disconnect();
    
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(mMessageReceiver);
    super.onDestroy();
}