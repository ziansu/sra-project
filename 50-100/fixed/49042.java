protected void subAppend(org.apache.log4j.spi.LoggingEvent event) {
    long n = java.lang.System.currentTimeMillis();
    if (n >= (nextCheck)) {
        now.setTime(n);
        nextCheck = rc.getNextCheckMillis(now);
        rollOver();
    }
    super.subAppend(event);
}