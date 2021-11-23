public void info(@javax.annotation.Nonnull
java.lang.Object message) {
    if (org.apache.log4j.Level.INFO.isGreaterOrEqual(level)) {
        log4jLogger.info(message);
        consoleLogger.info(message);
        java.lang.String richMsg = "[INFO]\t" + (wrapMsg(message));
        send(richMsg);
    }
}