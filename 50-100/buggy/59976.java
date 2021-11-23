public void testFetchLimitStringID() {
    siena.core.async.SienaFuture<java.util.List<siena.base.test.model.PersonStringID>> future = queryPersonStringIDOrderBy("id", siena.base.test.BaseAsyncTest.StringID_CURIE, false).fetch(1);
    java.util.List<siena.base.test.model.PersonStringID> people = future.get();
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.StringID_CURIE, people.get(0));
}