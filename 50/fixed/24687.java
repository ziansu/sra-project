@org.chromium.base.annotations.CalledByNative
private void onBluetoothRemoteGattCharacteristicAndroidDestruction() {
    org.chromium.base.Log.v(org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.TAG, "ChromeBluetoothRemoteGattCharacteristic Destroyed.");
    if ((mChromeDevice.mBluetoothGatt) != null) {
        mChromeDevice.mBluetoothGatt.setCharacteristicNotification(mCharacteristic, false);
    }
    mNativeBluetoothRemoteGattCharacteristicAndroid = 0;
    mChromeDevice.mWrapperToChromeCharacteristicsMap.remove(mCharacteristic);
}