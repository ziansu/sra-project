private void startPreview() {
    camera.startPreview();
    inPreview = true;
    getHost().autoFocusAvailable();
}