@java.lang.Override
public void onLeScan(android.bluetooth.BluetoothDevice device, int rssi, byte[] scanRecord) {
    java.lang.String devName = device.getName();
    if (devName.equals(mDeviceName)) {
        android.util.Log.i(MyActivity.TAG, "++++++++++++ DEVICE FOUND ++++++++++++");
        mBLEAdpater.stopLeScan(mLeScanCallBack);
        scanRecord[((scanRecord.length) - 1)] = ((byte) (rssi));
        returnAdvData(scanRecord);
    }
    android.util.Log.i(MyActivity.TAG, "++++++++++++ DEVICE ++++++++++++");
}