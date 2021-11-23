public void run() {
    for (int i = 0; i < 1024; i++) {
        try (io.opentracing.ActiveSpan activeSpan = tracer.buildSpan("test_span").startActive()) {
            io.opentracing.SpanContext ctx = activeSpan.context();
            long id = ((io.opentracing.SpanContext) (ctx)).getSpanId();
            org.junit.Assert.assertEquals(m.containsKey(id), false);
            m.put(java.lang.Long.toHexString(id), true);
        }
    }
}