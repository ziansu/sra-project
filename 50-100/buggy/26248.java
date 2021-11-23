@org.junit.Test
public void updateAfterConcurrentDeletionShouldCauseException() throws java.lang.Exception {
    createAndPersistNovel();
    session.clear();
    org.hibernate.Transaction transaction = session.beginTransaction();
    org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel novel = ((org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel) (session.get(org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel.class, "novel-1")));
    concurrentlyDeleteNovel();
    novel.setPosition(2);
    try {
        transaction.commit();
        org.fest.assertions.Fail.fail("Expected exception wasn't raised");
    } catch (java.lang.Exception e) {
        org.fest.assertions.Assertions.assertThat(org.hibernate.ogm.utils.Throwables.getRootCause(e)).isInstanceOf(org.hibernate.StaleObjectStateException.class);
    }
}