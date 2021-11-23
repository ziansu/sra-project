private void log(org.gradle.api.logging.LogLevel logLevel, java.lang.Throwable throwable, java.lang.String format, java.lang.Object arg1, java.lang.Object arg2) {
    log(logLevel, throwable, org.slf4j.helpers.MessageFormatter.format(format, arg1, arg2).getMessage());
}