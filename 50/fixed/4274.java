public static void assertContainsDestination(java.lang.String message, com.pronoia.junit.activemq.EmbeddedActiveMQBroker broker, java.lang.String expected) {
    org.junit.Assert.assertTrue(message, (null != (broker.getDestination(expected))));
}