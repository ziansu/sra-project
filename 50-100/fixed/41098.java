public static final boolean setLoggerLevel(final org.slf4j.Logger logger, final ch.qos.logback.classic.Level level) {
    if (logger == null) {
        return false;
    }
    if (!(de.metas.logging.LogManager.isOwnLogger(logger))) {
        return false;
    }
    if (logger instanceof org.slf4j.Logger) {
        ((org.slf4j.Logger) (logger)).setLevel(level);
        return true;
    }
    return false;
}