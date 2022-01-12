public synchronized void shootAgain() {
    cancelPhotoTimer();
    cam.cancelAutoFocus();
    photoRawData = null;
    try {
        cam.stopPreview();
        cam.startPreview();
        internalShoot();
    } catch (java.lang.Exception e) {
        logErr(e);
        closeRecordingMenu();
        closeCamera();
        finishRecording();
        e.printStackTrace();
    }
}