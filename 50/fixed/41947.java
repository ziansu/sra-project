public void resumeSelfScanning() {
    if (TeclaApp.persistence.isScanningEnabled()) {
        mHandler.postDelayed(mScanRunnable, TeclaApp.persistence.getScanDelay());
    }
}