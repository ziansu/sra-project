@org.junit.Test
public void testWrongEntityType() {
    org.sagebionetworks.repo.model.Project project = new org.sagebionetworks.repo.model.Project();
    project.setName("Test only");
    project.setId("99");
    testBundle.setEntity(project);
    previewWidget.configure(testBundle);
    previewWidget.asWidget();
    org.mockito.Mockito.verify(mockView).addSynapseAlertWidget(org.mockito.Matchers.any(com.google.gwt.user.client.ui.Widget.class));
    org.mockito.Mockito.verify(mockSynapseAlert).showError(org.mockito.Matchers.anyString());
}