@java.lang.Override
public void run() {
    if ((Build.VERSION.SDK_INT) < 21) {
    }else {
        mLEScanner.stopScan(mScanCallback);
    }
}