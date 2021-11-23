private android.bluetooth.BluetoothSocket createBluetoothSocket(android.bluetooth.BluetoothDevice device) throws java.io.IOException {
    if ((Build.VERSION.SDK_INT) >= 10) {
        try {
            final java.lang.reflect.Method m = device.getClass().getMethod("createInsecureRfcommSocketToServiceRecord", new java.lang.Class[]{ java.util.UUID.class });
            return ((android.bluetooth.BluetoothSocket) (m.invoke(device, dyhs.e_walker_companion.MainActivity.MY_UUID)));
        } catch (java.lang.Exception e) {
        }
    }
    return device.createRfcommSocketToServiceRecord(dyhs.e_walker_companion.MainActivity.MY_UUID);
}