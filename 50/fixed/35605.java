@org.junit.Test
public void constructWithRegistry_hasRegistry() throws java.lang.Exception {
    com.codahale.metrics.MetricRegistry registry = new com.codahale.metrics.MetricRegistry();
    new cloud.orbit.actors.extensions.metrics.dropwizard.MetricsExtension(registry);
    assertEquals(registry, cloud.orbit.actors.extensions.metrics.dropwizard.MetricsManager.getInstance().getRegistry());
}