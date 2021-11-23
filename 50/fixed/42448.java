public void onScanQRClick(android.view.View view) {
    mScannerView.setResultHandler(this);
    mScannerView.startCamera(0);
    showCameraDialog();
}