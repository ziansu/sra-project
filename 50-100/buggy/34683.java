public void testFilterOperatorNotEqualLongManualID() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonLongManualID>> future = pm.createQuery(siena.base.test.model.PersonLongManualID.class).filter("id!=", 3L).order("id").fetch();
    java.util.List<siena.base.test.model.PersonLongManualID> people = future.get();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.LongManualID_TESLA, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.LongManualID_CURIE, people.get(1));
}