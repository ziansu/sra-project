@org.junit.Test
public void testGetDisplayName() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertEquals(lts.getDisplayName(), "Slip single");
    org.junit.Assert.assertEquals(ltd.getDisplayName(), "Slip double");
}