protected void configureLogging() throws ch.qos.logback.core.joran.spi.JoranException, java.io.IOException {
    java.lang.String logbackConfigFile = getLogbackConfigFile();
    if (logbackConfigFile != null)
        try (java.io.InputStream inputStream = java.lang.Thread.currentThread().getContextClassLoader().getResourceAsStream(logbackConfigFile)) {
            ch.qos.logback.classic.LoggerContext context = ((ch.qos.logback.classic.LoggerContext) (org.slf4j.LoggerFactory.getILoggerFactory()));
            context.reset();
            ch.qos.logback.classic.joran.JoranConfigurator configurator = new ch.qos.logback.classic.joran.JoranConfigurator();
            configurator.setContext(context);
            configurator.doConfigure(inputStream);
        }
    
}