public void testIterLimitLongAutoID() {
    siena.core.async.SienaFuture<java.lang.Iterable<siena.base.test.model.PersonLongAutoID>> future = pm.createQuery(siena.base.test.model.PersonLongAutoID.class).order("n").iter(2);
    java.lang.Iterable<siena.base.test.model.PersonLongAutoID> people = future.get();
    assertNotNull(people);
    siena.base.test.model.PersonLongAutoID[] array = new siena.base.test.model.PersonLongAutoID[]{ siena.base.test.BaseAsyncTest.LongAutoID_TESLA , siena.base.test.BaseAsyncTest.LongAutoID_CURIE };
    int i = 0;
    for (siena.base.test.model.PersonLongAutoID person : people) {
        assertEquals(array[i], person);
        i++;
    }
}