public void start(boolean reset) {
    isBeeingRecored = true;
    if (reset) {
        chromatogramAcquisition.newAcquisition(scanDelay, DEFAULT_SCAN_INTERVAL);
    }
}