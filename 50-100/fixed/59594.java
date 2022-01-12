@org.junit.Test
public void testGetLinkType() {
    testNew();
    org.junit.Assert.assertEquals(ltRH.getLinkType(), LayoutTurnout.NO_LINK);
    org.junit.Assert.assertEquals(ltLH.getLinkType(), LayoutTurnout.NO_LINK);
    org.junit.Assert.assertEquals(ltWY.getLinkType(), LayoutTurnout.NO_LINK);
    org.junit.Assert.assertEquals(ltDX.getLinkType(), LayoutTurnout.NO_LINK);
    org.junit.Assert.assertEquals(ltRX.getLinkType(), LayoutTurnout.NO_LINK);
    org.junit.Assert.assertEquals(ltLX.getLinkType(), LayoutTurnout.NO_LINK);
}