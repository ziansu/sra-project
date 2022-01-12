public void testGetObjectNotFound() {
    try {
        getPersonUUID("");
        fail();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Everything is OK");
    }
    assertNull(pm.createQuery(siena.base.test.model.PersonUUID.class).filter("firstName", "John").get());
}