public void info(@javax.annotation.Nonnull
java.lang.Object message) {
    if (level.isGreaterOrEqual(org.apache.log4j.Level.INFO)) {
        log4jLogger.info(message);
        consoleLogger.info(message);
        java.lang.String richMsg = "[INFO]\t" + (wrapMsg(message));
        send(richMsg);
    }
}