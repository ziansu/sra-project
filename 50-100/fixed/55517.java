@org.junit.Test
public void Filter_setProperty_SetsPropertyValue() {
    net.bartushk.picletest.FilterTest.MockFilter filter = new net.bartushk.picletest.FilterTest.MockFilter();
    filter.setProperty("Test1", 12.0);
    filter.setProperty("Test2", (-22.0));
    assertEquals(filter.prop1.getValue(), 12.0, net.bartushk.picletest.TestUtils.EPSILON);
    assertEquals(filter.prop2.getValue(), (-22.0), net.bartushk.picletest.TestUtils.EPSILON);
}