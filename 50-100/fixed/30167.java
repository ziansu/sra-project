private static void configureLogback(final java.lang.String loggingPath, final ch.qos.logback.classic.LoggerContext lc, final ch.qos.logback.classic.Level logLevel, final ch.qos.logback.classic.Level rootLogLevel) {
    org.dswarm.init.LoggingConfigurator.configureRootLogger(loggingPath, lc, rootLogLevel);
    org.dswarm.init.LoggingConfigurator.configureDswarmLogger(loggingPath, lc, logLevel);
    org.dswarm.init.LoggingConfigurator.configureMonitoringLogger(loggingPath, lc);
}