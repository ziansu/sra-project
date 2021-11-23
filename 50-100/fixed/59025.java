public void testFilterOperatorNotEqualInt() {
    java.util.List<siena.base.test.model.PersonUUID> people = pm.createQuery(siena.base.test.model.PersonUUID.class).filter("n!=", 3).order("n").fetch();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_TESLA, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(1));
}