void stopMultiAdvertising(com.android.bluetooth.gatt.AdvertiseClient client) {
    enforceAdminPermission();
    mAdvertiseManager.stopAdvertising(client);
}