@org.junit.Test
public void testSwitchingDirectionTrue() {
    model.WalkerTest.walker.setFacingRight(false);
    model.WalkerTest.walker.switchDirection();
    org.junit.Assert.assertEquals(true, model.WalkerTest.walker.isFacingRight());
}