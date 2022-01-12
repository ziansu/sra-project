@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if ((mCamera) == null) {
        mCamera = com.ddeath.ZebraScanner.ZebraScannerView.getCameraInstance();
        mPreview = new com.ddeath.ZebraScanner.CameraPreview(zebraContext, mCamera, previewCb, autoFocusCB);
        addView(mPreview, 200, 200);
        mCamera.startPreview();
    }
}