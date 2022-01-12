private void switchView() {
    stopCamera();
    if (this.isBackCamera) {
        this.startCamera(1, false);
        setFlashButtons(false, false);
    }else {
        this.startCamera(0, false);
        setFlashButtons(true, false);
    }
    this.isBackCamera = !(this.isBackCamera);
    startPreview(surfaceView.getHolder());
}