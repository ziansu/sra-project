public long timePassed() {
    if (!(stopClock)) {
        return (java.lang.System.currentTimeMillis()) - (startTime);
    }else {
        return maxTime;
    }
}