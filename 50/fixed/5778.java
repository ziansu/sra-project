@org.junit.Test
public void testJsonBean() throws java.lang.Exception {
    org.example.soacourse.model.JsonBean jb = new org.example.soacourse.model.JsonBean();
    jb.setVal1("val1");
    org.junit.Assert.assertEquals(jb.getVal1(), "val1");
}