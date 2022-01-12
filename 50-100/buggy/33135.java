protected void logException(java.lang.Exception ex, javax.portlet.PortletRequest request) {
    if (((this.warnLogger) != null) && (this.warnLogger.isWarnEnabled())) {
        this.warnLogger.warn(buildLogMessage(ex, request), ex);
    }
}