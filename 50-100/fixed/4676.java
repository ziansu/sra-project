public static java.net.URI getFileName() {
    final org.apache.logging.log4j.core.LoggerContext context = ((org.apache.logging.log4j.core.LoggerContext) (org.apache.logging.log4j.LogManager.getContext(false)));
    final org.apache.logging.log4j.core.config.Configuration configuration = context.getConfiguration();
    return new java.io.File(((org.apache.logging.log4j.core.appender.FileAppender) (configuration.getAppender("FILE"))).getFileName()).toURI();
}