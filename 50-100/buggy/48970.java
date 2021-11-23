@org.junit.Before
public void setUp() {
    db = mock(com.mongodb.DB.class);
    mongoCollection = mock(com.mongodb.DBCollection.class);
    resourceDAO = mock(org.fiware.apps.repository.dao.impl.MongoResourceDAO.class);
    virtuosoResourceDAO = mock(org.fiware.apps.repository.dao.impl.VirtuosoResourceDAO.class);
    dBObject = mock(com.mongodb.DBObject.class);
    toTest = new org.fiware.apps.repository.dao.impl.MongoCollectionDAO(db, mongoCollection, virtuosoResourceDAO);
}