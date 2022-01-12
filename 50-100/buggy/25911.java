public void onBlueGattDisConnect(android.bluetooth.BluetoothGatt gatt) {
    android.util.Log.i(Util.TAG, ("onBlueGattDisConnect::adress == " + (gatt.getDevice().getAddress())));
    if ((mConnectBleInfo) == null)
        return ;
    
    if (!(gatt.getDevice().getAddress().equals(mConnectBleInfo.getAdress())))
        return ;
    
    mBleConnectionState = com.zhuozhi.monitor.MonitorService.STATE_DISCONNECTED;
    mHandler.sendEmptyMessage(com.zhuozhi.monitor.MonitorService.CONNECT_STATE_CHANGE);
    onPrepareStateChange();
    if (supportUplodData()) {
        mHandler.removeMessages(com.zhuozhi.monitor.MonitorService.BLE_REPORT);
    }
}