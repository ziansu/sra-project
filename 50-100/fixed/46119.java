@com.abc.Test
public void testSavingsAccountRateOne() {
    com.abc.Account checkingAccount = new com.abc.Account(Account.SAVINGS);
    bank.addCustomer(bill.openAccount(checkingAccount));
    checkingAccount.deposit(1000.0);
    org.junit.Assert.assertEquals(1.0, bank.totalInterestPaid(), com.abc.BankTest.DOUBLE_DELTA);
}