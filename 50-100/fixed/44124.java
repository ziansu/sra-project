public void testFilterOperatorMoreThan() {
    java.util.List<siena.base.test.model.PersonUUID> people = pm.createQuery(siena.base.test.model.PersonUUID.class).filter("n>", 1).order("n").fetch();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(1));
}