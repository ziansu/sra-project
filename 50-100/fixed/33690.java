private void configureDefaults() {
    if ((m_log4jContext) == null) {
        m_log4jContext = new org.apache.logging.log4j.core.LoggerContext("pax-logging");
    }
    m_log4jContext.start(new org.apache.logging.log4j.core.config.DefaultConfiguration());
    java.lang.String levelName;
    levelName = m_bundleContext.getProperty(org.ops4j.pax.logging.log4j2.internal.PaxLoggingServiceImpl.DEFAULT_SERVICE_LOG_LEVEL);
    if (levelName == null) {
        levelName = "DEBUG";
    }else {
        levelName = levelName.trim();
    }
    m_logLevel = org.ops4j.pax.logging.log4j2.internal.PaxLoggingServiceImpl.convertLevel(levelName);
}