@org.junit.Test
public void testFeatureDisabled() throws java.lang.Exception {
    when(mockConfiguration.getTableEnabled()).thenReturn(false);
    one.setObjectType(ObjectType.TABLE);
    two.setObjectType(ObjectType.TABLE);
    two.setChangeType(ChangeType.DELETE);
    worker.run(mockProgressCallback, one);
    worker.run(mockProgressCallback, two);
    org.mockito.Mockito.verifyZeroInteractions(mockConnectionFactory);
}