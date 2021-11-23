@org.junit.Test
public void testSwitchingDirectionFalse() {
    model.WalkerTest.walker.switchDirection();
    org.junit.Assert.assertFalse(model.WalkerTest.walker.isFacingRight());
}