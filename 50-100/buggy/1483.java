public void stopScan(com.m039.beacon.keeper.util.SimpleLeScanner.LeScanCallback callback) {
    android.bluetooth.BluetoothAdapter ba = com.m039.beacon.keeper.U.getBluetoothAdapter(mContext);
    if (((ba != null) && (mIsScanning)) && (callback != null)) {
        ba.stopLeScan(callback);
        onStopScan();
        mIsScanning = false;
    }else {
        com.m039.beacon.keeper.L.wtf(com.m039.beacon.keeper.util.SimpleLeScanner.TAG, "Failed to stopScan");
    }
}