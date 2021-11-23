public java.lang.String getLogLineBySubstring(java.lang.String substring) {
    java.lang.String actualLogString = null;
    synchronized(this) {
        for (ch.qos.logback.classic.spi.ILoggingEvent event : list) {
            final java.lang.String m = event.getFormattedMessage();
            if (m.contains(substring)) {
                actualLogString = m;
                break;
            }
        }
    }
    return actualLogString;
}