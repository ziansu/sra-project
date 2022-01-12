@org.junit.Test
public void shouldSendMetric() throws java.lang.Exception {
    java.lang.String name = "metrics.anothermetric.min";
    sendValue(name, delegate);
    verify(delegate).send(name, value, timestamp);
    verifyNoMoreInteractions(delegate);
}