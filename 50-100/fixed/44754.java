@java.lang.SuppressWarnings(value = "PMD")
@org.junit.Test
public void securityTest1() {
    request = makeRequest(1, nc.sumy.edu.webcontainer.sequrity.ServerSecurityTest.IP_VAR1);
    nc.sumy.edu.webcontainer.sequrity.ServerSecurity serverSecurity = new nc.sumy.edu.webcontainer.sequrity.ServerSecurity(request, serverConfiguration);
    org.junit.Assert.assertEquals(serverSecurity.isAllow(), true);
    request = makeRequest(1, "93.49.37.56");
    serverSecurity = new nc.sumy.edu.webcontainer.sequrity.ServerSecurity(request, serverConfiguration);
    org.junit.Assert.assertEquals(serverSecurity.isAllow(), false);
}