@java.lang.Override
public void sessionCreated(javax.servlet.http.HttpSessionEvent event) {
    org.springframework.context.ApplicationContext applicationContext = getApplicationContext(event);
    org.springframework.core.env.Environment env = applicationContext.getEnvironment();
    java.lang.String timeout = env.getProperty("session.timeout.interval");
    if ((timeout == null) || (timeout.isEmpty())) {
        timeout = de.interseroh.report.webapp.SessionListener.DEFAULT_TIMEOUT_INTERVAL;
    }
    event.getSession().setMaxInactiveInterval(java.lang.Integer.parseInt(timeout));
    if (de.interseroh.report.webapp.SessionListener.logger.isDebugEnabled()) {
        de.interseroh.report.webapp.SessionListener.logger.debug(("Session created, timeout: " + timeout));
    }
}