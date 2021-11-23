public void resumeSelfScanning() {
    pauseSelfScanning();
    if (TeclaApp.persistence.isScanningEnabled()) {
        mHandler.postDelayed(mScanRunnable, TeclaApp.persistence.getScanDelay());
    }
}