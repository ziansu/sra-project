@org.junit.Test
public void testWikiConfigureWithDotVersion() {
    java.lang.String entityId = "syn123";
    java.lang.Long versionNumber = 9L;
    descriptor.put(WidgetConstants.WIDGET_ENTITY_ID_KEY, ((entityId + ".") + versionNumber));
    previewWidget.configure(null, descriptor, null, null);
    org.mockito.Mockito.verify(mockSynapseClient).getEntityBundleForVersion(org.mockito.Matchers.eq(entityId), org.mockito.Matchers.eq(versionNumber), org.mockito.Matchers.anyInt(), org.mockito.Matchers.any(com.google.gwt.user.client.rpc.AsyncCallback.class));
}