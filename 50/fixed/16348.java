public void stop() {
    sm.unregisterListener(this);
    listening = false;
    logdata = false;
    filterDone = false;
    collectedSamples = 0;
}