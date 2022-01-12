private void scanBluetoothDevice(org.apache.cordova.CallbackContext callbackContext) {
    scanCallback = callbackContext;
    bluetoothAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
    if (!(bluetoothAdapter.isEnabled())) {
        android.content.Intent intent = new android.content.Intent(android.bluetooth.BluetoothAdapter.ACTION_REQUEST_ENABLE);
        cordova.getActivity().startActivityForResult(intent, Constant.REQUEST_ENABLE_BT);
    }else {
        findAvailableDevice();
    }
}