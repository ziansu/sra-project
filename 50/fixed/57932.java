public void requestLowPriority() {
    if (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) && ((mBluetoothGatt) != null)) {
        mBluetoothGatt.requestConnectionPriority(BluetoothGatt.CONNECTION_PRIORITY_LOW_POWER);
    }
}