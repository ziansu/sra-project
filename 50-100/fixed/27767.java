@org.junit.Test
public void testGetCashWhenNotEnoughMoneyOnAccount() {
    double moneyOnAccount = 5.3;
    double ammount = 5.4;
    ua.yandex.atmtest.Account account = mock(ua.yandex.atmtest.Account.class);
    when(account.getBalance()).thenReturn(moneyOnAccount);
    ua.yandex.atmtest.MyATM atm = new ua.yandex.atmtest.MyATM(account);
    ua.yandex.atmtest.MyATM spyATM = spy(atm);
    when(spyATM.isWorkingDay()).thenReturn(true);
    assertFalse(spyATM.getCash(ammount));
}