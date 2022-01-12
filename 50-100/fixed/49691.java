public static void main(java.lang.String[] args) throws org.apache.kerby.kerberos.kerb.KrbException {
    java.lang.String serverHost = "localhost";
    org.apache.kerby.kerberos.kerb.admin.server.kadmin.AdminServer adminServer;
    adminServer = new org.apache.kerby.kerberos.kerb.admin.server.kadmin.AdminServer();
    adminServer.setAdminHost(serverHost);
    adminServer.setAllowUdp(false);
    adminServer.setAllowTcp(true);
    adminServer.setAdminTcpPort(65417);
}