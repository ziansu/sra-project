@org.junit.Test
public void constructWithConfigs_hasRegistry() throws java.lang.Exception {
    cloud.orbit.actors.extensions.metrics.dropwizard.MetricsManager.getInstance().setRegistry(null);
    new cloud.orbit.actors.extensions.metrics.dropwizard.MetricsExtension(java.util.Collections.emptyList());
    assertNotNull(cloud.orbit.actors.extensions.metrics.dropwizard.MetricsManager.getInstance().getRegistry());
}