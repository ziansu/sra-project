protected void bleCharacteristicChanged(java.lang.String address, java.lang.String uuid, byte[] value) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_CHARACTERISTIC_CHANGED);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_UUID, uuid);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_VALUE, value);
    sendBroadcast(intent);
}