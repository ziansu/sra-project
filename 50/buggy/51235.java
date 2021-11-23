public void setWarnLogCategory(java.lang.String loggerName) {
    this.warnLogger = (loggerName != null) ? org.apache.commons.logging.LogFactory.getLog(loggerName) : null;
}