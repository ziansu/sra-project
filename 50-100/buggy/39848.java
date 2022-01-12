public synchronized android.bluetooth.BluetoothGatt connect(com.clj.fastble.data.ScanResult scanResult, boolean autoConnect, com.clj.fastble.conn.BleGattCallback callback) {
    com.clj.fastble.utils.BleLog.i(((((("connect name: " + (scanResult.getDevice().getName())) + "\nmac: ") + (scanResult.getDevice().getAddress())) + "\nautoConnect: ") + autoConnect));
    addConnectGattCallback(callback);
    return scanResult.getDevice().connectGatt(context, autoConnect, coreGattCallback);
}