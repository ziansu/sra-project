@java.lang.Override
protected void onPause() {
    super.onPause();
    flashOn = false;
    updateFlash();
    if (((com.manateeworks.ScannerActivity.param_OverlayMode) & (com.manateeworks.ScannerActivity.OM_MW)) > 0) {
        com.manateeworks.MWOverlay.removeOverlay();
    }
    if ((handler) != null) {
        com.manateeworks.camera.CameraManager.get().stopPreview();
        handler = null;
    }
    com.manateeworks.camera.CameraManager.get().closeDriver();
    state = com.manateeworks.ScannerActivity.State.STOPPED;
}