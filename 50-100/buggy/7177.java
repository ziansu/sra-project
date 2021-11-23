public void error(org.slf4j.Logger destLogger, java.lang.String message, java.lang.Object... args) {
    long nowMs = (java.lang.System.nanoTime()) / 1000000L;
    long elapsed = nowMs - (lastLoggedTime);
    if (elapsed > (minDelay)) {
        destLogger.warn(message, args);
        lastLoggedTime = nowMs;
    }
}