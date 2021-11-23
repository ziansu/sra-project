@org.junit.Test
public void tracerSupportsWithComponentName() throws java.lang.Exception {
    com.lightstep.tracer.shared.Options options = new com.lightstep.tracer.shared.Options.OptionsBuilder().withAccessToken("{your_access_token}").withComponentName("my_component").build();
    com.lightstep.tracer.jre.JRETracer tracer = new com.lightstep.tracer.jre.JRETracer(options);
    com.lightstep.tracer.shared.Status status = tracer.status();
    assertEquals("my_component", status.getTag("lightstep.component_name"));
}