@org.junit.Test
public void testIsMainline() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertFalse("lts.isMainline() false", lts.isMainline());
    org.junit.Assert.assertFalse("ltd.isMainline() false", ltd.isMainline());
}