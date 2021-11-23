public boolean log(java.util.logging.Level level, java.lang.String line) {
    if ((level.intValue()) >= (logLevel.intValue())) {
        logger.log(level, line);
        return true;
    }
    return false;
}