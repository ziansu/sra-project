@java.lang.Override
protected void onPause() {
    super.onPause();
    com.manateeworks.ScannerActivity.flashOn = false;
    com.manateeworks.ScannerActivity.activity = null;
    updateFlash();
    if (((com.manateeworks.ScannerActivity.param_OverlayMode) & (com.manateeworks.ScannerActivity.OM_MW)) > 0) {
        com.manateeworks.MWOverlay.removeOverlay();
    }
    if ((com.manateeworks.ScannerActivity.handler) != null) {
        com.manateeworks.camera.CameraManager.get().stopPreview();
        com.manateeworks.ScannerActivity.handler = null;
    }
    com.manateeworks.camera.CameraManager.get().closeDriver();
    com.manateeworks.ScannerActivity.state = com.manateeworks.ScannerActivity.State.STOPPED;
}