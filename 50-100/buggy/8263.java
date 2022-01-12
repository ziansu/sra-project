public void testFetchLimitOffset() {
    siena.core.async.QueryAsync<siena.base.test.model.PersonUUID> query = queryPersonUUIDOrderBy("n", 0, false);
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonUUID>> future = query.fetch(2, 1);
    java.util.List<siena.base.test.model.PersonUUID> people = future.get();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(1));
}