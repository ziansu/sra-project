protected void bleCharacteristicWrite(java.lang.String address, java.lang.String uuid, int status) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_CHARACTERISTIC_WRITE);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_UUID, uuid);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_STATUS, status);
    sendBroadcast(intent);
    requestProcessed(address, RequestType.WRITE_CHARACTERISTIC, true);
}