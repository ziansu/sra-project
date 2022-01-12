public java.util.stream.Stream<java.util.logging.LogRecord> stream(java.lang.Class<?> clazz, java.util.logging.Level level) {
    if (level == null) {
        throw new org.junit.platform.commons.JUnitException("Level must not be null");
    }
    return stream(clazz).filter(( logRecord) -> (logRecord.getLevel()) == level);
}