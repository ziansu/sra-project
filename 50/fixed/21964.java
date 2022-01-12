@org.junit.Test
public void create_account_successfully() throws java.lang.Exception {
    com.odde.bbuddy.account.domain.Account account = dataMother.getAccount();
    controller.createAccount(account);
    verify(accounts).createAccount(account);
}