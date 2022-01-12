private android.bluetooth.BluetoothGattService getMiliService() {
    return mGatt.getService(MiBandConstants.UUID_SERVICE_MILI_SERVICE);
}