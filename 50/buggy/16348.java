public void stop() {
    if (listening) {
        sm.unregisterListener(this);
        listening = false;
        logdata = false;
        filterDone = false;
        collectedSamples = 0;
    }
}