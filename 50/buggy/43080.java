@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    android.util.Log.d(com.pmdsolutions.gentiantestapp.SICActivity.TAG, ("Services Discovered: " + status));
    com.pmdsolutions.gentiantestapp.SICActivity.mHandler.sendMessage(android.os.Message.obtain(null, com.pmdsolutions.gentiantestapp.SICActivity.MSG_PROGRESS, "Enabling Sensors..."));
    reset();
    writeSecurity();
}