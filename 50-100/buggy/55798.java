public void testFetch() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonUUID>> future = queryPersonUUIDOrderBy("n", 0, false).fetch();
    java.util.List<siena.base.test.model.PersonUUID> people = future.get();
    assertNotNull(people);
    assertEquals(3, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_TESLA, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(1));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(2));
}