private void closeCamera() {
    if ((livecamThread) != null) {
        livecamThread.interrupt();
        livecamThread = null;
    }
    com.github.sarxos.webcam.Webcam webcam = com.github.sarxos.webcam.Webcam.getDefault();
    if (webcam.isOpen()) {
        webcam.close();
    }
}