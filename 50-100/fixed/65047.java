public void testFetchLimitLongManualID() {
    java.util.List<siena.base.test.model.PersonLongManualID> people = queryPersonLongManualIDOrderBy("id", 0, false).fetch(1);
    assertNotNull(people);
    assertEquals(1, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.LongManualID_TESLA, people.get(0));
}