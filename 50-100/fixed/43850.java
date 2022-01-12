private void scanLeDevice(final boolean enable) {
    if (enable) {
        mHandler.postDelayed(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                mScanning = false;
                mBluetoothAdapter.stopLeScan(mLeScanCallback);
            }
        }, com.ww23.l_band.ListenActivity.SCAN_PERIOD);
        mScanning = true;
        mBluetoothAdapter.startLeScan(mLeScanCallback);
    }else {
        mScanning = false;
        mBluetoothAdapter.stopLeScan(mLeScanCallback);
    }
}