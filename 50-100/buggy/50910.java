@org.junit.Test
public void testBuildExecutionFactoryWithDefaults() throws java.lang.Exception {
    org.teiid.adminapi.impl.VDBTranslatorMetaData tm = new org.teiid.adminapi.impl.VDBTranslatorMetaData();
    org.teiid.adminapi.impl.VDBTranslatorMetaData parent = new org.teiid.adminapi.impl.VDBTranslatorMetaData();
    parent.addProperty("myProperty", "default");
    parent.setExecutionFactoryClass(org.teiid.deployers.TestTranslatorUtil.MyTranslator.class);
    tm.setParent(parent);
    tm.addProperty("MyProperty", "correctly-assigned");
    org.teiid.deployers.TestTranslatorUtil.MyTranslator my = ((org.teiid.deployers.TestTranslatorUtil.MyTranslator) (org.teiid.deployers.TranslatorUtil.buildExecutionFactory(tm)));
    org.junit.Assert.assertEquals("correctly-assigned", my.getMyProperty());
}