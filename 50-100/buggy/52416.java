public void testInsertAsync() {
    siena.base.test.model.SampleModel mod = new siena.base.test.model.SampleModel();
    mod.clazz = java.lang.String.class;
    mod.foobar = "FOOBAR";
    mod.publicField = "PUBLIC_FIELD";
    mod.setPrivateField("PRIVATE_FIELD");
    mod.type = SampleModel.Type.FOO;
    siena.core.async.SienaFuture<java.lang.Void> future = mod.async().insert();
    future.get();
    java.util.List<siena.base.test.model.SampleModel> res = siena.base.test.model.SampleModel.all().fetch();
    for (siena.base.test.model.SampleModel m : res) {
        assertEquals(mod, m);
    }
}