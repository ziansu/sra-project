@org.junit.Test
public void testStartupWithRetryException() throws java.lang.InterruptedException {
    org.mockito.Mockito.doThrow(org.symphonyoss.integration.exception.bootstrap.RetryLifecycleException.class).doNothing().when(integration).onCreate(org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContextTest.TEST_USER);
    this.integrationBootstrapContext.initIntegrations();
    org.symphonyoss.integration.Integration integration = this.integrationBootstrapContext.getIntegrationById(org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContextTest.CONFIGURATION_ID);
    org.junit.Assert.assertNotNull(integration);
    org.junit.Assert.assertEquals(this.integration, integration);
    org.mockito.Mockito.verify(metricsController, org.mockito.Mockito.times(1)).addIntegrationTimer(org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContextTest.WEBHOOKINTEGRATION_TYPE_JIRA);
}