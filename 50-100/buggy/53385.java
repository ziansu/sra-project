@org.junit.Test(expected = java.lang.RuntimeException.class)
public void invalid_startup_date_throws_exception() {
    org.sonar.api.config.Settings settings = new org.sonar.api.config.MapSettings();
    settings.setProperty(CoreProperties.SERVER_STARTTIME, "invalid");
    org.sonar.scanner.bootstrap.ScannerWsClient client = org.mockito.Mockito.mock(org.sonar.scanner.bootstrap.ScannerWsClient.class);
    org.sonar.scanner.platform.DefaultServer metadata = new org.sonar.scanner.platform.DefaultServer(settings, client);
    metadata.getStartedAt();
}