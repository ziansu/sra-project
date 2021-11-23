public void testIterFullLongManualID() {
    java.lang.Iterable<siena.base.test.model.PersonLongManualID> people = pm.createQuery(siena.base.test.model.PersonLongManualID.class).order("n").iter();
    assertNotNull(people);
    siena.base.test.model.PersonLongManualID[] array = new siena.base.test.model.PersonLongManualID[]{ siena.base.test.BaseAsyncTest.LongManualID_TESLA , siena.base.test.BaseAsyncTest.LongManualID_CURIE , siena.base.test.BaseAsyncTest.LongManualID_EINSTEIN };
    int i = 0;
    for (siena.base.test.model.PersonLongManualID person : people) {
        assertEquals(array[i], person);
        i++;
    }
}