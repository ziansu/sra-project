public void testFetchOrder() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonUUID>> future = queryPersonUUIDOrderBy("firstName", "", false).fetch();
    java.util.List<siena.base.test.model.PersonUUID> people = future.get();
    assertNotNull(people);
    assertEquals(3, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(1));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_TESLA, people.get(2));
}