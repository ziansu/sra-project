public void testBatchDeleteByKeys() {
    siena.core.async.SienaFuture<java.lang.Integer> resf = pm.deleteByKeys(siena.base.test.model.PersonStringID.class, "TESLA", "CURIE");
    assertEquals(2, ((int) (resf.get())));
    java.util.List<siena.base.test.model.PersonStringID> res = pm.createQuery(siena.base.test.model.PersonStringID.class).fetch().get();
    assertEquals(1, res.size());
    assertEquals(siena.base.test.BaseAsyncTest.StringID_EINSTEIN, res.get(0));
}