public void testFilterOperatorNotEqualString() {
    java.util.List<siena.base.test.model.PersonStringID> people = pm.createQuery(siena.base.test.model.PersonStringID.class).filter("firstName!=", "Albert").order("firstName").fetch();
    assertNotNull(people);
    assertEquals(2, people.size());
    assertEquals(siena.base.test.BaseAsyncTest.StringID_CURIE, people.get(0));
    assertEquals(siena.base.test.BaseAsyncTest.StringID_TESLA, people.get(1));
}