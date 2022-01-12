private void showCaptureView() {
    if ((cameraPreviewLayout) != null) {
        cameraPreviewLayout.removeAllViews();
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