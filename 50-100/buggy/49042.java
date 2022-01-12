protected void subAppend(org.apache.log4j.spi.LoggingEvent event) {
    long n = java.lang.System.currentTimeMillis();
    if (n >= (nextCheck)) {
        now.setTime(n);
        nextCheck = rc.getNextCheckMillis(now);
        try {
            rollOver();
        } catch (java.io.IOException ioe) {
            if (ioe instanceof java.io.InterruptedIOException) {
                java.lang.Thread.currentThread().interrupt();
            }
            org.apache.log4j.helpers.LogLog.error("rollOver() failed.", ioe);
        }
    }
    super.subAppend(event);
}