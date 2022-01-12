@org.junit.Test
public void usesDefaultRegistry() throws java.lang.Exception {
    com.codahale.metrics.SharedMetricRegistries.add(InstrumentedAppender.DEFAULT_REGISTRY, registry);
    final com.codahale.metrics.logback.InstrumentedAppender shared = new com.codahale.metrics.logback.InstrumentedAppender();
    shared.start();
    org.mockito.Mockito.when(event.getLevel()).thenReturn(Level.INFO);
    shared.doAppend(event);
    org.assertj.core.api.Assertions.assertThat(com.codahale.metrics.SharedMetricRegistries.names().contains(InstrumentedAppender.DEFAULT_REGISTRY));
    org.assertj.core.api.Assertions.assertThat(registry.meter(((com.codahale.metrics.logback.InstrumentedAppenderTest.METRIC_NAME_PREFIX) + ".info")).getCount()).isEqualTo(1);
}