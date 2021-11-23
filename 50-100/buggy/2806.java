public void startScanning(long scanningTimeout) {
    if (scanningTimeout == 0) {
        scanningTimeout = org.esec.mcg.bleinsight.wrapper.BLEWrapper.SCANNING_TIMEOUT;
    }
    java.lang.Runnable timeout = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            stopScanning();
            mScanDeviceUiCallbacks.uiStopScanning();
        }
    };
    mHandler.postDelayed(timeout, scanningTimeout);
    mBluetoothLeScanner.startScan(mScanCallback);
}