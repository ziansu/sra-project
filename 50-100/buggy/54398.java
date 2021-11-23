@java.lang.Override
public void onLeScan(android.bluetooth.BluetoothDevice device, int rssi, byte[] scanRecord) {
    if (device == null)
        return ;
    
    if (((device.getName()) == null) || (!(device.getName().contains("UAES"))))
        return ;
    
    com.clj.fastble.data.ScanResult scanResult = new com.clj.fastble.data.ScanResult(device, rssi, scanRecord, java.lang.System.currentTimeMillis());
    onScanning(scanResult);
}