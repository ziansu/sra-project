public java.lang.String getLogFilename() {
    java.lang.String logFilename = null;
    try {
        java.util.Map<java.lang.String, java.lang.String> map = loggingConfig.getLoggingProperties();
        java.lang.String logFileContains = "${com.sun.aas.instanceName}";
        if (map != null) {
            logFilename = map.get(LoggingPropertyNames.file);
        }
        if ((logFilename != null) && (logFilename.contains(logFileContains))) {
            logFilename = com.sun.enterprise.universal.xml.MiniXmlParser.replaceOld(logFilename, logFileContains, this.serverName);
        }
    } catch (java.lang.Exception e) {
    }
    return logFilename;
}