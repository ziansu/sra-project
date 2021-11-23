@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d("BT SERVICE", "SERVICE CREATED");
    stopThread = false;
    android.content.IntentFilter filter2 = new android.content.IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST");
    registerReceiver(mBroadcastReceiver1, filter2);
    android.content.IntentFilter filter3 = new android.content.IntentFilter(android.bluetooth.BluetoothDevice.ACTION_ACL_CONNECTED);
    registerReceiver(mBroadcastReceiver1, filter3);
}