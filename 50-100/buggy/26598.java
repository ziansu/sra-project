public static java.util.Iterator<java.lang.String> createIfPossible(org.aksw.simba.squirrel.data.uri.CrawleableUri uri, java.lang.String logFile, java.util.Iterator<java.lang.String> iterator) {
    if (logFile == null) {
        return null;
    }
    org.aksw.simba.squirrel.log.DomainLogger logger = org.aksw.simba.squirrel.log.DomainLogger.create(uri, logFile, iterator);
    return logger == null ? iterator : logger;
}