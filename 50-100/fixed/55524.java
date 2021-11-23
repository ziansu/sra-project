@org.junit.Test
public void testGetCashWithZeroMoneyOnAccount() {
    double moneyOnAccount = 0;
    double ammount = 10;
    ua.yandex.atmtest.Account account = mock(ua.yandex.atmtest.Account.class);
    when(account.getBalance()).thenReturn(moneyOnAccount);
    ua.yandex.atmtest.MyATM atm = new ua.yandex.atmtest.MyATM(account);
    ua.yandex.atmtest.MyATM spyATM = spy(atm);
    when(spyATM.isWorkingDay()).thenReturn(true);
    assertFalse(spyATM.getCash(ammount));
}