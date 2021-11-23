public void testIndividualProcTimeout() throws java.io.IOException, java.lang.InterruptedException, org.voltdb.client.ProcCallException {
    m_username = "adminUser";
    m_password = "password";
    if ((isValgrind()) || (isDebug())) {
        return ;
    }
    org.voltdb.client.Client client;
    m_username = "adminUser";
    m_password = "password";
    client = getClient();
    checkIndividualProcTimeout(client, true);
    m_username = "userWithAllProc";
    m_password = "password";
    client = getClient();
    checkIndividualProcTimeout(client, false);
}