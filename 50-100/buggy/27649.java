@com.abc.Test
public void testMaxiSavingsAccountRateOne() {
    com.abc.Bank bank = new com.abc.Bank();
    com.abc.Account checkingAccount = new com.abc.Account(Account.MAXI_SAVINGS);
    bank.addCustomer(bill.openAccount(checkingAccount));
    checkingAccount.deposit(1000.0);
    org.junit.Assert.assertEquals(20, bank.totalInterestPaid(), com.abc.BankTest.DOUBLE_DELTA);
}