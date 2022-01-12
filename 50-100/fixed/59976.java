public void testFetchLimitStringID() {
    java.util.List<siena.base.test.model.PersonStringID> people = queryPersonStringIDOrderBy("id", siena.base.test.BaseAsyncTest.StringID_CURIE, false).fetch(1);
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.StringID_CURIE, people.get(0));
}