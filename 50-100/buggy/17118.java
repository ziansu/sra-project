public void testFilterOperatorNotEqualString() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonStringID>> future = pm.createQuery(siena.base.test.model.PersonStringID.class).filter("firstName!=", "Albert").order("firstName").fetch();
    java.util.List<siena.base.test.model.PersonStringID> people = future.get();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.StringID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.StringID_TESLA, people.get(1));
}