public void testFetchLimitLongManualID() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonLongManualID>> future = queryPersonLongManualIDOrderBy("id", 0, false).fetch(1);
    java.util.List<siena.base.test.model.PersonLongManualID> people = future.get();
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.LongManualID_TESLA, people.get(0));
}