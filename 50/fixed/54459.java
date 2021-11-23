@java.lang.Override
protected void onResume() {
    super.onResume();
    if ((mScannerView) != null) {
        mScannerView.setResultHandler(this);
        mScannerView.startCamera();
    }
}