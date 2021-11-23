public void testIterFilterLimit() {
    java.lang.Iterable<siena.base.test.model.PersonUUID> people = pm.createQuery(siena.base.test.model.PersonUUID.class).filter("n>", 1).order("n").iter(1);
    assertNotNull(people);
    siena.base.test.model.PersonUUID[] array = new siena.base.test.model.PersonUUID[]{ siena.base.test.BaseAsyncTest.UUID_CURIE };
    int i = 0;
    for (siena.base.test.model.PersonUUID PersonIntKey : people) {
        assertEquals(array[i], PersonIntKey);
        i++;
    }
}