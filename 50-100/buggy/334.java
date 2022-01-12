@org.junit.Test
public void testNotFoundException() throws java.lang.Exception {
    java.lang.String tableId = "456";
    java.lang.String resetToken = "reset-token";
    org.sagebionetworks.repo.model.table.TableStatus status = new org.sagebionetworks.repo.model.table.TableStatus();
    status.setResetToken(resetToken);
    org.mockito.Mockito.when(mockTableManagerSupport.startTableProcessing(tableId)).thenThrow(new org.sagebionetworks.repo.web.NotFoundException("This table does not exist"));
    two.setObjectType(ObjectType.TABLE);
    two.setChangeType(ChangeType.UPDATE);
    two.setObjectEtag(resetToken);
    worker.run(mockProgressCallback, two);
    org.mockito.Mockito.verifyZeroInteractions(mockTableIndexManager);
}