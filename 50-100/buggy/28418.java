public static void error(java.lang.String loggerName, java.lang.String message) {
    org.apache.log4j.Logger.getRootLogger().error(((("[" + loggerName) + "] ") + message));
    java.lang.System.err.println(((("ERROR [" + loggerName) + "] ") + message));
}