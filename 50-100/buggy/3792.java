private static void populateJavaPropertyVariables() {
    if (org.apache.flink.test.util.SecureTestEnvironment.LOG.isDebugEnabled()) {
        java.lang.System.setProperty("sun.security.krb5.debug", "true");
    }
    java.lang.System.setProperty("java.security.krb5.conf", org.apache.flink.test.util.SecureTestEnvironment.kdc.getKrb5conf().getAbsolutePath());
    java.lang.System.setProperty("zookeeper.authProvider.1", "org.apache.zookeeper.server.auth.SASLAuthenticationProvider");
    java.lang.System.setProperty("zookeeper.kerberos.removeHostFromPrincipal", "true");
    java.lang.System.setProperty("zookeeper.kerberos.removeRealmFromPrincipal", "true");
    java.lang.System.setProperty("zookeeper.sasl.client", "false");
}