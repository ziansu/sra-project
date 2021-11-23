public void logAlways(com.microsoft.applicationinsights.internal.logger.InternalLogger.LoggingLevel requestLevel, java.lang.String message, java.lang.Object... args) {
    java.lang.String logMessage = com.microsoft.applicationinsights.internal.logger.InternalLogger.createMessage(requestLevel.toString(), message, args);
    if ((!(initialized)) || ((loggerOutput) == null)) {
        new com.microsoft.applicationinsights.internal.logger.ConsoleLoggerOutput().log(logMessage);
    }else {
        loggerOutput.log(logMessage);
    }
}