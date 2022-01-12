@java.lang.Override
public void onCharacteristicRead(final android.bluetooth.BluetoothGatt gatt, final android.bluetooth.BluetoothGattCharacteristic characteristic, final int status) {
    readRemoteRssiPeriodic(gatt);
    if (status == (android.bluetooth.BluetoothGatt.GATT_SUCCESS)) {
        mBluetoothGatt = gatt;
        mRequestCompleted = true;
    }else {
        android.util.Log.e(sentek.drillanddropconfig.services.BluetoothLeService.TAG, ("Characteristic read error: " + status));
        mError = (sentek.drillanddropconfig.services.BluetoothLeService.ERROR_CONNECTION_MASK) | status;
    }
    synchronized(mLock) {
        mLock.notifyAll();
    }
}