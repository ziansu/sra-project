public void testIterFilterLimitOffset() {
    java.lang.Iterable<siena.base.test.model.PersonUUID> people = pm.createQuery(siena.base.test.model.PersonUUID.class).filter("n>", 1).order("n").iter(2, 1);
    assertNotNull(people);
    siena.base.test.model.PersonUUID[] array = new siena.base.test.model.PersonUUID[]{ siena.base.test.BaseAsyncTest.UUID_EINSTEIN };
    int i = 0;
    for (siena.base.test.model.PersonUUID PersonIntKey : people) {
        assertEquals(array[i], PersonIntKey);
        i++;
    }
}