public void testFilterOperatorEqualUUID() {
    java.util.List<siena.base.test.model.PersonUUID> l = getOrderedPersonUUIDs();
    siena.base.test.model.PersonUUID person = pm.createQuery(siena.base.test.model.PersonUUID.class).filter("id", l.get(0).id).get();
    assertNotNull(person);
    assertEquals(l.get(0), person);
}