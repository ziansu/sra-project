public void bleCharacteristicNotification(java.lang.String address, java.lang.String uuid, boolean isEnabled, int status) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_CHARACTERISTIC_NOTIFICATION);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_UUID, uuid);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_VALUE, isEnabled);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_STATUS, status);
    sendBroadcast(intent);
    if (isEnabled) {
        requestProcessed(address, RequestType.CHARACTERISTIC_NOTIFICATION, true);
    }else {
        requestProcessed(address, RequestType.CHARACTERISTIC_STOP_NOTIFICATION, true);
    }
    setNotificationAddress(address);
}