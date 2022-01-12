@org.junit.Test
public void testLoginOK() {
    java.lang.System.out.println("loginOK");
    java.lang.String name = "test";
    eu.jangos.auth.controller.AccountService as = new eu.jangos.auth.controller.AccountService();
    eu.jangos.auth.model.Account account = as.getAccount(name);
    java.lang.String ip = "127.0.0.1";
    java.lang.String locale = "frFR";
    java.lang.String session = "640067444B1823BA653F6141D2F7508D213F3A213D9ED6C0A469AAD3FBB584C45458D83CF796A369";
    eu.jangos.auth.controller.AccountService instance = new eu.jangos.auth.controller.AccountService();
    assertTrue(instance.login(account, ip, locale, session));
    account.setOnline(false);
    as.update(account);
}