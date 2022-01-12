@org.junit.Test
public void testWikiConfigureWithVersion() {
    descriptor.put(WidgetConstants.WIDGET_ENTITY_ID_KEY, "syn111");
    descriptor.put(WidgetConstants.WIDGET_ENTITY_VERSION_KEY, "1");
    previewWidget.configure(null, descriptor, null, null);
    org.mockito.Mockito.verify(mockSynapseClient).getEntityBundleForVersion(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyLong(), org.mockito.Matchers.anyInt(), org.mockito.Matchers.any(com.google.gwt.user.client.rpc.AsyncCallback.class));
}