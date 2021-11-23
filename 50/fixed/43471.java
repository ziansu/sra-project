@org.junit.Test
public void testDebitWithInsufficientFunds() {
    xyl.BankAccount account = new xyl.BankAccount(10);
    double amount = account.debit(15);
    assertEquals(10.0, amount, 0);
}