public void stop() throws java.io.IOException {
    isRunning = false;
    if ((audioLine) != null) {
        audioLine.drain();
        audioLine.close();
    }
}