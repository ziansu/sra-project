@org.junit.Test
public void healthcheck_unitInLowerCase() throws java.lang.Exception {
    io.gravitee.definition.model.Api api = load("/io/gravitee/definition/jackson/services/healtcheck/api-withservice-healthcheck-unitInLowerCase.json", io.gravitee.definition.model.Api.class);
    io.gravitee.definition.model.services.healthcheck.HealthCheckService healthCheckService = api.getServices().get(io.gravitee.definition.model.services.healthcheck.HealthCheckService.class);
    org.junit.Assert.assertNotNull(healthCheckService);
    org.junit.Assert.assertFalse(healthCheckService.isEnabled());
    org.junit.Assert.assertEquals(60, healthCheckService.getTrigger().getRate());
    org.junit.Assert.assertEquals(java.util.concurrent.TimeUnit.SECONDS, healthCheckService.getTrigger().getUnit());
}