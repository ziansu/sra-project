@java.lang.Override
public void onServicesDiscovered(android.bluetooth.BluetoothGatt gatt, int status) {
    android.util.Log.d(com.pmdsolutions.gentiantestapp.SICActivity.TAG, ("Services Discovered: " + status));
    writeSecurity(gatt);
}