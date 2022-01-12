@org.junit.Test(expected = org.fiware.apps.repository.exceptions.db.DatasourceException.class)
public void getCollectionsExceptionTest() throws org.fiware.apps.repository.exceptions.db.DatasourceException {
    java.lang.String id = "/id";
    java.util.Date date = new java.util.Date();
    mongoCollection = org.powermock.api.mockito.PowerMockito.mock(com.mongodb.DBCollection.class);
    toTest = new org.fiware.apps.repository.dao.impl.MongoCollectionDAO(db, mongoCollection, virtuosoResourceDAO);
    org.powermock.api.mockito.PowerMockito.when(mongoCollection.find(any())).thenThrow(java.lang.Exception.class);
    rulesdbObjectCollection(id, date);
    toTest.getCollections(id);
}