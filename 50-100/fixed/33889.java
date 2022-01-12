@org.junit.Test
public void testGetDisplayName() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    org.junit.Assert.assertNotNull("LayoutEditor exists", jmri.jmrit.display.layoutEditor.LayoutSlipTest.layoutEditor);
    org.junit.Assert.assertNotNull("LayoutSlip single not null", lts);
    org.junit.Assert.assertNotNull("LayoutSlip double not null", ltd);
    org.junit.Assert.assertEquals("Slip single", lts.getDisplayName());
    org.junit.Assert.assertEquals("Slip double", ltd.getDisplayName());
}