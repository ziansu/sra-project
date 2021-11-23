@java.lang.Override
public void call(com.a.eye.skywalking.trace.TraceSegment traceSegment) {
    org.hamcrest.MatcherAssert.assertThat(traceSegment.getSpans().size(), org.hamcrest.CoreMatchers.is(1));
    assertConsumerSpan(traceSegment.getSpans().get(0));
    testParam.assertSelf("127.0.0.1");
}