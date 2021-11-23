private boolean isTimeUpdate() {
    if ((updateInterval) == 0) {
        return false;
    }
    long diff = (java.lang.System.currentTimeMillis()) - (lastStatusUpdate);
    return diff >= (updateInterval);
}