public void start(boolean reset) {
    isBeeingRecored = true;
    if (reset) {
        chromatogramAcquisition.newAcquisition(DEFAULT_SCAN_INTERVAL, scanDelay);
    }
}