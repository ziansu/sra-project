@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((mScannerView) != null) {
        mScannerView.startCamera();
        mScannerView.setResultHandler(this);
    }
}