public void bleGattConnected(android.bluetooth.BluetoothDevice device) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_GATT_CONNECTED);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_DEVICE, device);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, device.getAddress());
    sendBroadcast(intent);
    requestProcessed(device.getAddress(), RequestType.CONNECT_GATT, true);
}