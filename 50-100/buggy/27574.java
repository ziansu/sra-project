@org.junit.Test
public void testGetBlockBName() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertEquals(ltRH.getBlockBName(), "");
    org.junit.Assert.assertEquals(ltLH.getBlockBName(), "");
    org.junit.Assert.assertEquals(ltWY.getBlockBName(), "");
    org.junit.Assert.assertEquals(ltDX.getBlockBName(), "");
    org.junit.Assert.assertEquals(ltRX.getBlockBName(), "");
    org.junit.Assert.assertEquals(ltLX.getBlockBName(), "");
}