public void fatal(@javax.annotation.Nonnull
java.lang.Object message) {
    if (org.apache.log4j.Level.FATAL.isGreaterOrEqual(level)) {
        log4jLogger.fatal(message);
        consoleLogger.fatal(message);
        java.lang.String richMsg = "[FATAL]\t" + (wrapMsg(message));
        send(richMsg);
    }
}