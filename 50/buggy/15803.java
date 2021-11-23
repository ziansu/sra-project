@org.junit.Test
public void testDebitWithInsufficientFunds() {
    xyl.BankAccount account = new xyl.BankAccount(10);
    double amount = amount.debit(15);
    org.junit.Assert.Assert.assertEquals(10.0, amount, 0);
}