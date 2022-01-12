@org.junit.Test
public void display_account_list() {
    org.springframework.ui.Model model = mock(org.springframework.ui.Model.class);
    java.util.List<com.odde.bbuddy.account.domain.Account> accounts = dataMother.getAccounts();
    when(this.accounts.getList()).thenReturn(accounts);
    controller.list(model);
    verify(model).addAttribute("accounts", accounts);
}