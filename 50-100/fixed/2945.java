public void testIterLimitLongAutoID() {
    java.lang.Iterable<siena.base.test.model.PersonLongAutoID> people = pm.createQuery(siena.base.test.model.PersonLongAutoID.class).order("n").iter(2);
    assertNotNull(people);
    siena.base.test.model.PersonLongAutoID[] array = new siena.base.test.model.PersonLongAutoID[]{ siena.base.test.BaseAsyncTest.LongAutoID_TESLA , siena.base.test.BaseAsyncTest.LongAutoID_CURIE };
    int i = 0;
    for (siena.base.test.model.PersonLongAutoID person : people) {
        assertEquals(array[i], person);
        i++;
    }
}