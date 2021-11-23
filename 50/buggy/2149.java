public boolean hasTimeElapsed(long time) {
    return (isStarted()) && (((java.lang.System.currentTimeMillis()) + time) > (timeStarted));
}