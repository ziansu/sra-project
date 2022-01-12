@java.lang.Override
public void onDestroy() {
    android.support.v4.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(UARTStatusChangeReceiver);
    super.onDestroy();
}