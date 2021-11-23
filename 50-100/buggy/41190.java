@org.junit.Test
public void concurrentModificationShouldCauseException() throws java.lang.Exception {
    org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel novel = createAndPersistNovel();
    java.lang.String newRevision = doConcurrentUpdateToNovel();
    org.fest.assertions.Assertions.assertThat(newRevision).isNotEqualTo(novel.get_rev());
    org.hibernate.Transaction transaction = session.beginTransaction();
    novel.setDescription("Description 2");
    try {
        transaction.commit();
        org.fest.assertions.Fail.fail("Expected exception wasn't raised");
    } catch (java.lang.Exception e) {
        org.fest.assertions.Assertions.assertThat(org.hibernate.ogm.utils.Throwables.getRootCause(e)).isInstanceOf(org.hibernate.StaleObjectStateException.class);
    }
}