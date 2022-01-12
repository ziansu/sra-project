private void setupEntity(org.sagebionetworks.repo.model.Project entity, java.util.Date lastActivityDate) throws org.sagebionetworks.schema.adapter.JSONObjectAdapterException {
    org.sagebionetworks.web.test.helper.AsyncMockStubber.callSuccessWith(entity).when(mockSynapseClient).getProject(org.mockito.Matchers.anyString(), org.mockito.Matchers.any(com.google.gwt.user.client.rpc.AsyncCallback.class));
    org.sagebionetworks.repo.model.ProjectHeader header = new org.sagebionetworks.repo.model.ProjectHeader();
    header.setId(entity.getId());
    header.setName(entity.getName());
    header.setLastActivity(lastActivityDate);
    widget.configure(header);
}