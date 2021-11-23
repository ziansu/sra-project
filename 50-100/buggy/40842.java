@org.junit.Test
public void test() throws java.lang.Exception {
    infoportalinterface.InfoPortalInterface ip = TestInfoPortalInterfaceFactory.getInfoPortalInterface();
    java.lang.String mainPage = ip.login();
    ip.fetchLehrkraefte(mainPage);
    java.lang.System.out.println(ip.getLehrkraefte());
    ip.fetchKlassen(mainPage, ip.getLehrkraefte());
    ip.fetchNoten(mainPage);
    java.lang.System.out.println(ip.getKlassen());
    ip.logout();
}