@org.junit.Test
public void testToString() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    java.lang.String ltsString = lts.toString();
    org.junit.Assert.assertNotNull("ltsString not null", ltsString);
    org.junit.Assert.assertEquals(ltsString, "LayoutSlip single");
    java.lang.String ltdString = ltd.toString();
    org.junit.Assert.assertNotNull("ltdString not null", ltdString);
    org.junit.Assert.assertEquals(ltdString, "LayoutSlip double");
}