public void testFilterOperatorMoreThanForLongAutoID() {
    java.util.List<siena.base.test.model.PersonLongAutoID> people = pm.createQuery(siena.base.test.model.PersonLongAutoID.class).filter("id>", siena.base.test.BaseAsyncTest.LongAutoID_TESLA.id).order("id").fetch();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.LongAutoID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.LongAutoID_EINSTEIN, people.get(1));
}