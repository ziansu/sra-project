private org.apache.log4j.Appender getAppenderInLoggerWithName(org.apache.log4j.Logger logger, java.lang.String appenderName) {
    java.util.Enumeration appenders = logger.getAllAppenders();
    org.apache.log4j.Appender targetAppender = null;
    while (appenders.hasMoreElements()) {
        org.apache.log4j.Appender appender = ((org.apache.log4j.Appender) (appenders.nextElement()));
        if ((appender.getName()) != null) {
            if (appender.getName().equals(appenderName)) {
                targetAppender = appender;
                break;
            }
        }
    } 
    return targetAppender;
}