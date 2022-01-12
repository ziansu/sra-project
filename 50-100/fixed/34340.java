public synchronized void shootAgain() {
    cancelPhotoTimer();
    photoRawData = null;
    if ((cam) != null) {
        try {
            cam.cancelAutoFocus();
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
}