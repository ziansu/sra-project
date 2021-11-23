@com.abc.Test
public void testSavingsAccountRateTwo() {
    com.abc.Account checkingAccount = new com.abc.Account(Account.SAVINGS);
    bank.addCustomer(bill.openAccount(checkingAccount));
    checkingAccount.deposit(2000.0);
    org.junit.Assert.assertEquals(4.0, bank.totalInterestPaid(), com.abc.BankTest.DOUBLE_DELTA);
}