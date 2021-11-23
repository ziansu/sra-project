public boolean unpairDevice(final android.bluetooth.BluetoothDevice bluetoothDevice) {
    try {
        return ((java.lang.Boolean) (bluetoothDevice.getClass().getMethod("removeBond", ((java.lang.Class<?>[]) (null))).invoke(bluetoothDevice, ((java.lang.Object[]) (null)))));
    } catch (java.lang.Exception ex) {
        com.resmed.refresh.utils.Log.d("com.resmed.refresh.bluetooth", ex.getMessage());
        return false;
    }
}