@org.junit.Test
public void testGetTurnoutType() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertEquals(ltRH.getTurnoutType(), LayoutTurnout.RH_TURNOUT);
    org.junit.Assert.assertEquals(ltLH.getTurnoutType(), LayoutTurnout.LH_TURNOUT);
    org.junit.Assert.assertEquals(ltWY.getTurnoutType(), LayoutTurnout.WYE_TURNOUT);
    org.junit.Assert.assertEquals(ltDX.getTurnoutType(), LayoutTurnout.DOUBLE_XOVER);
    org.junit.Assert.assertEquals(ltRX.getTurnoutType(), LayoutTurnout.RH_XOVER);
    org.junit.Assert.assertEquals(ltLX.getTurnoutType(), LayoutTurnout.LH_XOVER);
}