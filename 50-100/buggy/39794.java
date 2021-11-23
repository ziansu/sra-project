public void testFetchLimit() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonUUID>> future = queryPersonUUIDOrderBy("n", 0, false).fetch(1);
    java.util.List<siena.base.test.model.PersonUUID> people = future.get();
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_TESLA, people.get(0));
}