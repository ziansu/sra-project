public void start() {
    if (!(running)) {
        internalRecorder.start();
    }
    running = true;
}