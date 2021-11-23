@org.junit.Test
public void testFieldBeanWithNoValue() {
    de.tblsoft.solr.pipeline.bean.Field f = new de.tblsoft.solr.pipeline.bean.Field("foo", null);
    f.setValues(new java.util.ArrayList<java.lang.String>());
    org.junit.Assert.assertNull(f.getValue());
}