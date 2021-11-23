@org.junit.Test
public void testSwitchingDirectionTrue() {
    model.WalkerTest.walker.setFacingRight(false);
    model.WalkerTest.walker.switchDirection();
    org.junit.Assert.assertTrue(model.WalkerTest.walker.isFacingRight());
}