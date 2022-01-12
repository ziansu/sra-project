@org.junit.Test
public void testStartupBootstrappingOneIntegration() throws java.lang.InterruptedException {
    this.integrationBootstrapContext.initIntegrations();
    org.symphonyoss.integration.Integration integration = this.integrationBootstrapContext.getIntegrationById(org.symphonyoss.integration.core.bootstrap.IntegrationBootstrapContextTest.CONFIGURATION_ID);
    assertNotNull(integration);
    assertEquals(this.integration, integration);
    org.mockito.Mockito.verify(publisher, org.mockito.Mockito.times(1)).publishEvent(org.mockito.Matchers.any(org.symphonyoss.integration.event.HealthCheckEventData.class));
}