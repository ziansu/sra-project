public static void leave(final org.apache.log4j.Logger logger, final java.lang.String method) {
    if (logger.isTraceEnabled()) {
        logger.trace(com.xavax.logger.XLogger.format(logger, method, com.xavax.logger.XLogger.LEAVE));
    }
}