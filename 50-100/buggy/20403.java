@org.junit.Before
public void mockSpan() {
    long id = createId();
    org.springframework.cloud.sleuth.Span spanMock = org.springframework.cloud.sleuth.Span.builder().name("mock").traceId(id).spanId(id).build();
    org.mockito.Mockito.doReturn(spanMock.traceIdString()).when(span).traceIdString();
    org.mockito.Mockito.doReturn(span).when(tracer).getCurrentSpan();
    org.mockito.Mockito.doReturn(span).when(tracer).createSpan(org.mockito.Matchers.anyString());
}