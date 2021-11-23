public boolean evaluate(ch.qos.logback.classic.spi.ILoggingEvent event) throws ch.qos.logback.core.boolex.EvaluationException, java.lang.NullPointerException {
    java.util.Date now = new java.util.Date();
    double timeElapsed = ((now.getTime()) - (lastSync.getTime())) / 1000.0;
    if (timeElapsed > (logSendingInterval)) {
        lastSync = now;
        return true;
    }
    return (event.getLevel().levelInt) >= (ch.qos.logback.classic.Level.ERROR_INT);
}