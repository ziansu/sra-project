@org.junit.Test
public void testStartupWithUnrecoverableException() throws java.lang.InterruptedException {
    org.mockito.Mockito.doThrow(org.symphonyoss.integration.exception.IntegrationRuntimeException.class).when(integration).onCreate(org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContextTest.TEST_USER);
    this.integrationBootstrapContext.initIntegrations();
    assertNull(this.integrationBootstrapContext.getIntegrationById(org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContextTest.CONFIGURATION_ID));
}