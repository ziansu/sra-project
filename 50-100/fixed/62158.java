@org.junit.Test
public void activeSpanTryWithResources() throws java.lang.Exception {
    io.opentracing.Tracer tracer = new com.lightstep.tracer.jre.JRETracer(new com.lightstep.tracer.shared.Options.OptionsBuilder().withAccessToken("{your_access_token}").build());
    try (io.opentracing.ActiveSpan activeSpan = tracer.buildSpan("test_span").startActive()) {
        activeSpan.setTag("test", "test");
        assertNotNull(tracer.activeSpan());
    }
    assertNull(tracer.activeSpan());
}