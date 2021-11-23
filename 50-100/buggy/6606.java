@java.lang.Override
public void onServicesDiscovered(final android.bluetooth.BluetoothGatt gatt, final int status) {
    android.util.Log.e("debug", "onServicesDiscovered");
    if (gatt.getDevice().getName().contains("SensorTag")) {
        sensorTag(gatt);
    }else
        if (gatt.getDevice().getName().contains("estimote")) {
            estimote(gatt);
        }else {
        }
    
}