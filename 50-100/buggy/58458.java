public void testFetchLimitUUID() {
    java.util.List<siena.base.test.model.PersonUUID> l = getOrderedPersonUUIDs();
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonUUID>> future = queryPersonUUIDOrderBy("id", l.get(0), false).fetch(1);
    java.util.List<siena.base.test.model.PersonUUID> people = future.get();
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(l.get(0), people.get(0));
}