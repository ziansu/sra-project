public void fatal(@javax.annotation.Nonnull
java.lang.Object message) {
    if (level.isGreaterOrEqual(org.apache.log4j.Level.FATAL)) {
        log4jLogger.fatal(message);
        consoleLogger.fatal(message);
        java.lang.String richMsg = "[FATAL]\t" + (wrapMsg(message));
        send(richMsg);
    }
}