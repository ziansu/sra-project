@org.junit.Test
public void testTurnoutB() {
    org.junit.Assume.assumeFalse(java.awt.GraphicsEnvironment.isHeadless());
    testNew();
    org.junit.Assert.assertTrue("lts.getTurnoutBName() is ''", ((lts.getTurnoutBName()) == ""));
    org.junit.Assert.assertNull("lts.getTurnoutB() is null", lts.getTurnoutB());
    org.junit.Assert.assertTrue("ltd.getTurnoutBName() is ''", ((ltd.getTurnoutBName()) == ""));
    org.junit.Assert.assertNull("ltd.getTurnoutB() is null", ltd.getTurnoutB());
}