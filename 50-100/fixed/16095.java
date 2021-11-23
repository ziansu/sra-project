public static void warn(java.lang.String loggerName, java.lang.String message) {
    java.lang.System.err.println(((("WARN [" + loggerName) + "] ") + message));
    org.apache.log4j.Logger.getRootLogger().warn(((("[" + loggerName) + "] ") + message));
}