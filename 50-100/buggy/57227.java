@java.lang.Override
public com.eguma.barcodescanner.ReactBarcodeScannerView createViewInstance(com.facebook.react.uimanager.ThemedReactContext context) {
    context.addLifecycleEventListener(this);
    mScannerView = new com.eguma.barcodescanner.ReactBarcodeScannerView(context);
    mScannerView.setMaskColor(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_VIEWFINDER_BACKGROUND_COLOR);
    mScannerView.setBorderColor(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_VIEWFINDER_BORDER_COLOR);
    mScannerView.setBorderStrokeWidth(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_VIEWFINDER_BORDER_WIDTH);
    mScannerView.setBorderLineLength(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_VIEWFINDER_BORDER_LENGTH);
    mScannerView.setDrawLaser(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_VIEWFINDER_DRAW_LASER);
    mScannerView.setLaserColor(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_VIEWFINDER_LASER_COLOR);
    mScannerView.setCameraType(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_CAMERA_TYPE);
    mScannerView.setTorchMode(com.eguma.barcodescanner.ReactBarcodeScannerManager.DEFAULT_TORCH_MODE);
    mScannerViewVisible = true;
    return mScannerView;
}