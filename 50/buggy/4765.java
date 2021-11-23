@com.facebook.react.bridge.ReactMethod
public void startScanning(com.facebook.react.bridge.ReadableArray serviceUuids, java.lang.Boolean allowDuplicates) {
    bluetoothAdapter.startLeScan(callback);
}