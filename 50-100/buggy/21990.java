@org.junit.Test(expected = org.fiware.apps.repository.exceptions.db.DatasourceException.class)
public void deleteCollectionExceptionTest1() throws org.fiware.apps.repository.exceptions.db.DatasourceException {
    java.lang.String id = "/id";
    java.util.Date date = new java.util.Date();
    db = org.powermock.api.mockito.PowerMockito.mock(com.mongodb.DB.class);
    toTest = new org.fiware.apps.repository.dao.impl.MongoCollectionDAO(db, mongoCollection, virtuosoResourceDAO);
    rulesdbObjectCollection(id, date);
    org.powermock.api.mockito.PowerMockito.when(db.getCollection(anyString())).thenThrow(java.lang.Exception.class);
    toTest.deleteCollection(id);
}