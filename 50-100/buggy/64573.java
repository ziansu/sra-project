private void closeCamera() {
    if ((livecamThread) != null) {
        livecamThread.interrupt();
        livecamThread = null;
    }
    if (isCameraDetected()) {
        if ((slCam.getValue()) == 1) {
            com.github.sarxos.webcam.Webcam webcam = com.github.sarxos.webcam.Webcam.getDefault();
            if (webcam.isOpen()) {
                webcam.close();
            }
        }else {
        }
    }
}