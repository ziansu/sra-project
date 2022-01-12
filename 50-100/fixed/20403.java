@org.junit.Before
public void mockSpan() {
    long id = createId();
    span = org.springframework.cloud.sleuth.Span.builder().name("mock").traceId(id).spanId(id).build();
    org.mockito.Mockito.doReturn(span).when(tracer).getCurrentSpan();
    org.mockito.Mockito.doReturn(span).when(tracer).createSpan(org.mockito.Matchers.anyString());
}