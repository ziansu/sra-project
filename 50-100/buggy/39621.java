protected void append(org.apache.log4j.spi.LoggingEvent event) {
    int level = getSeverity(event);
    java.lang.String message = event.getRenderedMessage();
    java.lang.Throwable exp = ((event.getThrowableInformation()) != null) ? event.getThrowableInformation().getThrowable() : null;
    log.log(new org.eclipse.core.runtime.Status(level, pluginID, message, exp));
}