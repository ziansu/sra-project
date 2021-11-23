@org.junit.Test
public void testGetBalanceIsZeroAfterDeposit500ThenClose() {
    double cash = 500;
    model.Account instance = new model.Account();
    instance.deposit(cash);
    double expResult = 500.0;
    double result = instance.getBalance();
    assertEquals(expResult, result, 0.0);
    expResult = 0.0;
    instance.close();
    result = instance.getBalance();
    assertEquals(expResult, result, 0.0);
}