@org.junit.Test
public void testGetConnectionTypesFail() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    try {
        org.junit.Assert.assertNull("lts.getConnectionType(SLIP_CENTER) is null", lts.getConnection(LayoutTrack.SLIP_CENTER));
        org.junit.Assert.fail("lts.getConnectionType(SLIP_CENTER): No exception thrown");
    } catch (jmri.jmrit.display.layoutEditor.jmri.JmriException e) {
        jmri.util.JUnitAppender.assertErrorMessage("Invalid Connection Type 20");
    }
    try {
        org.junit.Assert.assertNull("ltd.getConnectionType(SLIP_CENTER) is null", ltd.getConnection(LayoutTrack.SLIP_CENTER));
        org.junit.Assert.fail("ltd.getConnectionType(SLIP_CENTER): No exception thrown");
    } catch (jmri.jmrit.display.layoutEditor.jmri.JmriException e) {
        jmri.util.JUnitAppender.assertErrorMessage("Invalid Connection Type 20");
    }
}