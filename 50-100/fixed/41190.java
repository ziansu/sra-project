@org.junit.Test(expected = org.hibernate.StaleObjectStateException.class)
public void concurrentModificationShouldCauseException() throws java.lang.Exception {
    org.hibernate.ogm.datastore.couchdb.test.dialect.optimisticlocking.Novel novel = createAndPersistNovel();
    java.lang.String newRevision = doConcurrentUpdateToNovel();
    org.fest.assertions.Assertions.assertThat(newRevision).isNotEqualTo(novel.get_rev());
    org.hibernate.Transaction transaction = session.beginTransaction();
    novel.setDescription("Description 2");
    transaction.commit();
}