private void switchView() {
    stopCamera();
    if (this.isBackCamera) {
        this.isBackCamera = !(this.isBackCamera);
        this.startCamera(1, false);
        setFlashButtons(false, false);
    }else {
        this.isBackCamera = !(this.isBackCamera);
        this.startCamera(0, false);
        setFlashButtons(true, false);
    }
    startPreview(surfaceView.getHolder());
}