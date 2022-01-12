public void testFetchOrderDesc() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonUUID>> future = queryPersonUUIDOrderBy("lastName", "", true).fetch();
    java.util.List<siena.base.test.model.PersonUUID> people = future.get();
    assertNotNull(people);
    assertEquals(3, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_TESLA, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(1));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(2));
}