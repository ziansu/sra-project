@java.lang.Override
public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder service) {
    android.util.Log.d(TAG, "start service Connection");
    mBluetoothLeService = ((com.jasperwong.smartbicycle.service.BLEService.LocalBinder) (service)).getService();
    java.util.List<android.bluetooth.BluetoothGattService> gattServiceList = mBluetoothLeService.getSupportedGattServices();
    mCharacteristic = com.jasperwong.smartbicycle.ble.GATTUtils.lookupGattServices(gattServiceList, GATTUtils.BLE_TX);
    mCharacteristic.setValue("123");
    mBluetoothLeService.writeCharacteristic(mCharacteristic);
    if (null != (mCharacteristic)) {
        mBluetoothLeService.setCharacteristicNotification(mCharacteristic, true);
    }
}