private void scanBluetoothDevice(org.apache.cordova.CallbackContext callbackContext) {
    scanCallback = callbackContext;
    android.content.IntentFilter filter = new android.content.IntentFilter(android.bluetooth.BluetoothDevice.ACTION_FOUND);
    cordova.getActivity().registerReceiver(bluetoothReceiver, filter);
    boolean result = bluetoothAdapter.startDiscovery();
    if (!result) {
        callbackContext.error(Constant.SCAN_BLUETOOTHDEVICE_FAIL);
    }
}