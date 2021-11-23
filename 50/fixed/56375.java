void stopMultiAdvertising(com.android.bluetooth.gatt.AdvertiseClient client) {
    enforceAdminPermission();
    if ((mAdvertiseManager) != null) {
        mAdvertiseManager.stopAdvertising(client);
    }
}