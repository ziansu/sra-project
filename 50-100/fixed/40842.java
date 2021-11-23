@org.junit.Test
public void test() throws java.lang.Exception {
    infoportalinterface.InfoPortalInterface ip = TestInfoPortalInterfaceFactory.getInfoPortalInterface();
    ip.login();
    ip.fetchLehrkraefte();
    java.lang.System.out.println(ip.getLehrkraefte());
    ip.fetchKlassen(ip.getLehrkraefte());
    ip.fetchNoten();
    java.lang.System.out.println(ip.getKlassen());
    ip.logout();
}