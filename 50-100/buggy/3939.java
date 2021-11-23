public boolean unpairDevice(final android.bluetooth.BluetoothDevice bluetoothDevice) {
    java.lang.Boolean value = false;
    try {
        value = ((java.lang.Boolean) (bluetoothDevice.getClass().getMethod("removeBond", ((java.lang.Class<?>[]) (null))).invoke(bluetoothDevice, ((java.lang.Object[]) (null)))));
        return value;
    } catch (java.lang.Exception ex) {
        com.resmed.refresh.utils.Log.d("com.resmed.refresh.bluetooth", ex.getMessage());
        return value;
    }
}