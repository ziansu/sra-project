@org.junit.Test
public void testSendMatchingMessage() throws java.lang.Exception {
    org.apache.camel.CamelContext camelctx = new org.apache.camel.impl.DefaultCamelContext();
    camelctx.addRoutes(getRouteBuilder());
    camelctx.start();
    org.apache.camel.ProducerTemplate producer = camelctx.createProducerTemplate();
    java.lang.String result = producer.requestBodyAndHeader("direct:start", "mybody", "foo", "bar", java.lang.String.class);
    org.junit.Assert.assertEquals("mybody", result);
}