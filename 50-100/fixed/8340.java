public void bleCharacteristicRead(java.lang.String address, java.lang.String uuid, int status, byte[] value) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_CHARACTERISTIC_READ);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_UUID, uuid);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_STATUS, status);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_VALUE, value);
    sendBroadcast(intent);
    requestProcessed(address, RequestType.READ_CHARACTERISTIC, true);
}