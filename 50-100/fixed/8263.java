public void testFetchLimitOffset() {
    siena.core.async.QueryAsync<siena.base.test.model.PersonUUID> query = queryPersonUUIDOrderBy("n", 0, false);
    java.util.List<siena.base.test.model.PersonUUID> people = query.fetch(2, 1);
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(1));
}