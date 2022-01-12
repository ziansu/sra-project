public void testListenerCreationCounts() {
    h.getCore();
    assertEquals("Unexpected number of listeners created", org.apache.solr.core.TestQuerySenderListener.EXPECTED_MOCK_LISTENER_INSTANCES, ((org.apache.solr.core.MockEventListener.getCreateCount()) - (org.apache.solr.core.TestQuerySenderListener.preInitMockListenerCount)));
}