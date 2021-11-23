@org.junit.Test
public void testInitialSetValueExecutionFactory() throws java.lang.Exception {
    org.teiid.adminapi.impl.VDBTranslatorMetaData tm = new org.teiid.adminapi.impl.VDBTranslatorMetaData();
    tm.setExecutionFactoryClass(org.teiid.deployers.TestTranslatorUtil.MyTranslator2.class);
    org.teiid.deployers.TestTranslatorUtil.MyTranslator2 my = ((org.teiid.deployers.TestTranslatorUtil.MyTranslator2) (org.teiid.deployers.TranslatorUtil.buildExecutionFactory(tm)));
    org.junit.Assert.assertEquals("original-assigned", my.getSomeProperty());
}