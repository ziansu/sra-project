public void stop() throws java.io.IOException {
    isRunning = false;
    audioLine.stop();
    audioLine.close();
}