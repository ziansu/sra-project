public void testFilterOperatorEqualUUID() {
    java.util.List<siena.base.test.model.PersonUUID> l = getOrderedPersonUUIDs();
    siena.core.async.SienaFuture<siena.base.test.model.PersonUUID> future = pm.createQuery(siena.base.test.model.PersonUUID.class).filter("id", l.get(0).id).get();
    siena.base.test.model.PersonUUID person = future.get();
    assertNotNull(person);
    assertEquals(l.get(0), person);
}