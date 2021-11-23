@org.junit.Test
public void testWikiConfigure() {
    descriptor.put(WidgetConstants.WIDGET_ENTITY_ID_KEY, "syn111");
    previewWidget.configure(null, descriptor, null, null);
    org.mockito.Mockito.verify(mockSynapseClient).getEntityBundle(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyInt(), org.mockito.Matchers.any(com.google.gwt.user.client.rpc.AsyncCallback.class));
}