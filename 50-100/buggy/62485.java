@java.lang.Override
public void onLeScan(android.bluetooth.BluetoothDevice device, int rssi, byte[] scanRecord) {
    if (mScanLeDeviceList.contains(device))
        return ;
    
    mScanLeDeviceList.add(device);
    if ((mOnLeScanListener) != null) {
        mOnLeScanListener.onLeScan(device, rssi, scanRecord);
    }
    broadcastUpdate(com.junkchen.blelib.ACTION_BLUETOOTH_DEVICE, device);
}