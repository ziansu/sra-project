public io.logz.log4j2.LogzioAppender.Builder setLogzioUrl(java.lang.String logzioUrl) {
    if (logzioUrl != null) {
        this.logzioUrl = io.logz.log4j2.LogzioAppender.getValueFromSystemEnvironmentIfNeeded(logzioUrl);
    }
    return this;
}