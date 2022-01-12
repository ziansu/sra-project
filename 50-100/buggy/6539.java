private java.lang.String checkForProblem(final java.lang.String sapClient) {
    try {
        final com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext config = new com.sap.cloud.sdk.s4hana.connectivity.ErpConfigContext(com.sap.cloud.sdk.s4hana.connectivity.ErpDestination.getDefaultName(), new com.sap.cloud.sdk.s4hana.serialization.SapClient(sapClient), java.util.Locale.ENGLISH);
        final com.sap.cloud.sdk.tutorial.command.HealthCheckCommand healthCheckCommand = new com.sap.cloud.sdk.tutorial.command.HealthCheckCommand(config);
        org.springframework.util.Assert.isTrue(healthCheckCommand.execute(), "Empty OData result.");
        return null;
    } catch (final java.lang.Exception e) {
        com.sap.cloud.sdk.tutorial.controllers.ODataHealthIndicator.logger.error("Could not complete health check for OData Service.", e);
        return (e.getMessage()) + (java.util.Arrays.toString(e.getStackTrace()));
    }
}