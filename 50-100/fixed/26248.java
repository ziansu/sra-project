@org.junit.Test(expected = org.hibernate.StaleObjectStateException.class)
public void updateAfterConcurrentDeletionShouldCauseException() throws java.lang.Exception {
    createAndPersistNovel();
    session.clear();
    org.hibernate.Transaction transaction = session.beginTransaction();
    org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel novel = ((org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel) (session.get(org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel.class, "novel-1")));
    concurrentlyDeleteNovel();
    novel.setPosition(2);
    transaction.commit();
}