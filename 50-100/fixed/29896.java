public void testIterLimitOffsetLongStringID() {
    java.lang.Iterable<siena.base.test.model.PersonStringID> people = pm.createQuery(siena.base.test.model.PersonStringID.class).order("n").iter(2, 1);
    assertNotNull(people);
    siena.base.test.model.PersonStringID[] array = new siena.base.test.model.PersonStringID[]{ siena.base.test.BaseAsyncTest.StringID_CURIE , siena.base.test.BaseAsyncTest.StringID_EINSTEIN };
    int i = 0;
    for (siena.base.test.model.PersonStringID person : people) {
        assertEquals(array[i], person);
        i++;
    }
}