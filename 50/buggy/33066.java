protected void bleNoBtAdapter() {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_NO_BT_ADAPTER);
    sendBroadcast(intent);
}