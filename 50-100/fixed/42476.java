@org.junit.Test
public void testBuildExecutionFactory1() throws java.lang.Exception {
    org.teiid.adminapi.impl.VDBTranslatorMetaData tm = new org.teiid.adminapi.impl.VDBTranslatorMetaData();
    tm.addProperty("someproperty", "correctly-assigned");
    tm.setExecutionFactoryClass(org.teiid.deployers.TestTranslatorUtil.MyTranslator1.class);
    org.teiid.deployers.TestTranslatorUtil.MyTranslator1 my = ((org.teiid.deployers.TestTranslatorUtil.MyTranslator1) (org.teiid.deployers.TranslatorUtil.buildExecutionFactory(tm)));
    assertNull(my.getMyProperty());
    assertEquals("correctly-assigned", my.getSomeProperty());
}