@org.junit.Test
public void getNullValueTest() {
    final org.sonar.api.config.Settings settings = new org.sonar.api.config.MapSettings();
    final java.lang.String value = null;
    settings.setProperty(com.blackducksoftware.integration.hub.sonar.manager.SonarManagerTest.EXAMPLE_KEY, value);
    final com.blackducksoftware.integration.hub.sonar.manager.SonarManager manager = new com.blackducksoftware.integration.hub.sonar.manager.SonarManager(settings);
    org.junit.Assert.assertNotNull(manager.getValue(com.blackducksoftware.integration.hub.sonar.manager.SonarManagerTest.EXAMPLE_KEY));
    org.junit.Assert.assertEquals("", manager.getValue(com.blackducksoftware.integration.hub.sonar.manager.SonarManagerTest.EXAMPLE_KEY));
}