public void run() {
    if ((camera) != null) {
        camera.cancelAutoFocus();
        camera.autoFocus(autoFocusCb);
    }
}