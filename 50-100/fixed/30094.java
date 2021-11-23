public void init(boolean forceNewConnection) throws java.io.IOException, java.lang.SecurityException, javax.security.auth.login.FailedLoginException {
    org.datadog.jmxfetch.Instance.LOGGER.info(("Trying to connect to JMX Server at " + (this.toString())));
    connection = getConnection(yaml, forceNewConnection);
    org.datadog.jmxfetch.Instance.LOGGER.info(("Connected to JMX Server at " + (this.toString())));
    this.refreshBeansList();
    this.getMatchingAttributes();
}