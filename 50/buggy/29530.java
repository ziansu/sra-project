private void log(org.gradle.api.logging.LogLevel logLevel, java.lang.Throwable throwable, java.lang.String format, java.lang.Object arg) {
    log(logLevel, throwable, org.slf4j.helpers.MessageFormatter.format(format, arg).getMessage());
}