private void showCaptureView() {
    setContentView(R.layout.ocr_capture_camera_preview);
    if ((cameraPreviewLayout) != null) {
        cameraPreviewLayout.removeAllViews();
        cameraPreviewLayout = null;
    }
    cameraPreviewLayout.addView(ocrCapture.getCameraPreview());
    btnTakePicture.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            ocrCapture.hciOcrCaptureStopAndRecog();
        }
    });
    ocrCapture.hciOcrCaptureStart(recogConfig);
}