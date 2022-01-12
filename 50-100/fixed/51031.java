public void error(@javax.annotation.Nonnull
java.lang.Object message) {
    if (level.isGreaterOrEqual(org.apache.log4j.Level.ERROR)) {
        log4jLogger.error(message);
        consoleLogger.error(message);
        java.lang.String richMsg = "[ERROR]\t" + (wrapMsg(message));
        send(richMsg);
    }
}