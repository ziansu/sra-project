public void testFilterOperatorMoreThan() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonUUID>> future = pm.createQuery(siena.base.test.model.PersonUUID.class).filter("n>", 1).order("n").fetch();
    java.util.List<siena.base.test.model.PersonUUID> people = future.get();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.UUID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.UUID_EINSTEIN, people.get(1));
}