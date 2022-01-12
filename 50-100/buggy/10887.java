@org.junit.Test
public void testSendNonMatchingMessage() throws java.lang.Exception {
    java.lang.Thread.currentThread().setContextClassLoader(getClass().getClassLoader());
    org.apache.camel.CamelContext camelctx = new org.apache.camel.impl.DefaultCamelContext();
    camelctx.addRoutes(getRouteBuilder());
    camelctx.start();
    org.apache.camel.ProducerTemplate producer = camelctx.createProducerTemplate();
    java.lang.String result = producer.requestBodyAndHeader("direct:start", "mybody", "foo", "bad", java.lang.String.class);
    org.junit.Assert.assertEquals("mybody unmatched", result);
}