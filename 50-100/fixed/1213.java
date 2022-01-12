@org.junit.Test
public void testNoWork() throws java.lang.Exception {
    when(mockTableManagerSupport.isIndexWorkRequired(tableId)).thenReturn(false);
    two.setObjectType(ObjectType.TABLE);
    two.setChangeType(ChangeType.UPDATE);
    two.setObjectEtag(resetToken);
    worker.run(mockProgressCallback, two);
    org.mockito.Mockito.verifyZeroInteractions(mockTableIndexManager);
}