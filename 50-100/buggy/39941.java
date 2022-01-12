@org.junit.Test
public void testWikiConfigureInvalidEntityId() {
    java.lang.String entityId = "123.9";
    descriptor.put(WidgetConstants.WIDGET_ENTITY_ID_KEY, entityId);
    previewWidget.configure(null, descriptor, null, null);
    org.mockito.Mockito.verify(mockView).addSynapseAlertWidget(any(com.google.gwt.user.client.ui.Widget.class));
    org.mockito.Mockito.verify(mockSynapseAlert).showError(org.mockito.Matchers.anyString());
}