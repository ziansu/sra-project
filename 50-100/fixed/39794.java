public void testFetchLimit() {
    java.util.List<siena.base.test.model.PersonUUID> people = queryPersonUUIDOrderBy("n", 0, false).fetch(1);
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_TESLA, people.get(0));
}