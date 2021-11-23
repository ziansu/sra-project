private void stopPreview() {
    camera.startPreview();
    inPreview = false;
    getHost().autoFocusUnavailable();
    camera.stopPreview();
}