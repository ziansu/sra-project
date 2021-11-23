@org.junit.Test(expected = com.notronix.newrelic.events.APIViolationException.class)
public void testInvalidEventType() throws com.notronix.newrelic.events.APIViolationException {
    com.notronix.newrelic.events.NewRelicEvent event = new com.notronix.newrelic.events.NewRelicEvent() {
        @java.lang.Override
        public java.lang.String getEventType() {
            return "Bad.Event";
        }
    };
    com.notronix.newrelic.events.NewRelicClient client = new com.notronix.newrelic.events.NewRelicClient();
    client.setInsertKey("test");
    client.setAccountId(1);
    try {
        client.submit(event);
    } catch (java.lang.IllegalStateException | com.notronix.newrelic.events.NewRelicLoggingException | java.lang.NullPointerException e) {
        org.junit.Assert.fail("Should not have thrown any other exception than an APIViolationException.");
    }
}