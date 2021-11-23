@org.junit.Test
public void shouldSendMetric() throws java.lang.Exception {
    com.codahale.metrics.graphite.GraphiteSender delegate = mock(com.codahale.metrics.graphite.GraphiteSender.class);
    java.lang.String name = "metrics.anothermetric.min";
    sendValue(name, delegate);
    verify(delegate).send(name, value, timestamp);
    verifyNoMoreInteractions(delegate);
}