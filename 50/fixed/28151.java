@org.junit.Test
public void testCheckForValidMoneyInput() {
    boolean result = com.markbrown.wutangfinancial.InputChecker.checkForValidMoneyInput("1000.00");
    org.junit.Assert.assertTrue(result);
}