@org.junit.Test
public void testLimitCheckIncorrect() {
    boolean limitReached = this.player.balanceExceedsLimitBy(this.bet);
    assertTrue(limitReached);
}