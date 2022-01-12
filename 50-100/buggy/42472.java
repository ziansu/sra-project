@org.junit.Test
public void testGetConnectB() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertNull(ltRH.getConnectB());
    org.junit.Assert.assertNull(ltLH.getConnectB());
    org.junit.Assert.assertNull(ltWY.getConnectB());
    org.junit.Assert.assertNull(ltDX.getConnectB());
    org.junit.Assert.assertNull(ltRX.getConnectB());
    org.junit.Assert.assertNull(ltLX.getConnectB());
}