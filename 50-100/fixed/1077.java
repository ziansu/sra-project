@org.junit.Test
public void testBuildExecutionFactoryCaseInsensitive() throws java.lang.Exception {
    org.teiid.adminapi.impl.VDBTranslatorMetaData tm = new org.teiid.adminapi.impl.VDBTranslatorMetaData();
    tm.addProperty("myproperty", "correctly-assigned");
    tm.setExecutionFactoryClass(org.teiid.deployers.TestTranslatorUtil.MyTranslator.class);
    org.teiid.deployers.TestTranslatorUtil.MyTranslator my = ((org.teiid.deployers.TestTranslatorUtil.MyTranslator) (org.teiid.deployers.TranslatorUtil.buildExecutionFactory(tm)));
    assertEquals("correctly-assigned", my.getMyProperty());
}