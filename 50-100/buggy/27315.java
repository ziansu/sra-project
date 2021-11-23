@org.junit.Before
public void init() throws org.mule.api.ConnectionException, org.mule.tools.devkit.ctf.exceptions.ConfigurationLoadingFailedException {
    org.mule.module.jira.Config config = new org.mule.module.jira.Config();
    final java.util.Properties prop = org.mule.tools.devkit.ctf.configuration.util.ConfigurationUtils.getAutomationCredentialsProperties();
    username = prop.getProperty("config.username");
    password = prop.getProperty("config.password");
    endpoint = prop.getProperty("config.endpoint");
    config.connect(username, password, endpoint);
    connector.setConfig(config);
}