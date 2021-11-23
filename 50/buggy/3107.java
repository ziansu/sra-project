@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(UARTStatusChangeReceiver);
}