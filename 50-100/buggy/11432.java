public void testFilterOperatorMoreThanOrEqualForLongAutoID() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonLongAutoID>> future = pm.createQuery(siena.base.test.model.PersonLongAutoID.class).filter("id>=", siena.base.test.BaseAsyncTest.LongAutoID_CURIE.id).order("id").fetch();
    java.util.List<siena.base.test.model.PersonLongAutoID> people = future.get();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.LongAutoID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.LongAutoID_EINSTEIN, people.get(1));
}