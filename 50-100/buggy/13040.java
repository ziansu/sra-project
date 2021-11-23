@org.junit.Test
public void display_account_list() {
    org.springframework.ui.Model model = org.mockito.Mockito.mock(org.springframework.ui.Model.class);
    java.util.List<com.odde.bbuddy.account.domain.Account> accounts = dataMother.getAccounts();
    org.mockito.Mockito.when(this.accounts.getList()).thenReturn(accounts);
    controller.list(model);
    org.mockito.Mockito.verify(model).addAttribute("accounts", accounts);
}