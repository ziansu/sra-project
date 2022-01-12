public boolean hasTimeElapsed(long time) {
    return (isStarted()) && (time < ((java.lang.System.currentTimeMillis()) - (timeStarted)));
}