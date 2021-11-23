public void testIterFullLongManualID() {
    siena.core.async.SienaFuture<java.lang.Iterable<siena.base.test.model.PersonLongManualID>> future = pm.createQuery(siena.base.test.model.PersonLongManualID.class).order("n").iter();
    java.lang.Iterable<siena.base.test.model.PersonLongManualID> people = future.get();
    assertNotNull(people);
    siena.base.test.model.PersonLongManualID[] array = new siena.base.test.model.PersonLongManualID[]{ siena.base.test.BaseAsyncTest.LongManualID_TESLA , siena.base.test.BaseAsyncTest.LongManualID_CURIE , siena.base.test.BaseAsyncTest.LongManualID_EINSTEIN };
    int i = 0;
    for (siena.base.test.model.PersonLongManualID person : people) {
        assertEquals(array[i], person);
        i++;
    }
}