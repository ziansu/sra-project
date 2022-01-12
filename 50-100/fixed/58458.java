public void testFetchLimitUUID() {
    java.util.List<siena.base.test.model.PersonUUID> l = getOrderedPersonUUIDs();
    java.util.List<siena.base.test.model.PersonUUID> people = queryPersonUUIDOrderBy("id", l.get(0), false).fetch(1);
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(l.get(0), people.get(0));
}