@org.junit.Test
public void testGetVersion() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertEquals(ltRH.getVersion(), 1);
    org.junit.Assert.assertEquals(ltLH.getVersion(), 1);
    org.junit.Assert.assertEquals(ltWY.getVersion(), 1);
    org.junit.Assert.assertEquals(ltDX.getVersion(), 1);
    org.junit.Assert.assertEquals(ltRX.getVersion(), 1);
    org.junit.Assert.assertEquals(ltLX.getVersion(), 1);
}