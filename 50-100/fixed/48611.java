public void testFetchOrder() {
    java.util.List<siena.base.test.model.PersonUUID> people = queryPersonUUIDOrderBy("firstName", "", false).fetch();
    assertNotNull(people);
    assertEquals(3, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(1));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_TESLA, people.get(2));
}