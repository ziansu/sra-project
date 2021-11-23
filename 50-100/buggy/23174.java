public void createPrincipal(java.io.File keytabFile, java.lang.String... principals) throws java.lang.Exception {
    synchronized(this) {
        simpleKdc.createPrincipals(principals);
    }
    if ((keytabFile.exists()) && (!(keytabFile.delete()))) {
        org.apache.hadoop.minikdc.MiniKdc.LOG.error(("Failed to delete keytab file: " + keytabFile));
    }
    for (java.lang.String principal : principals) {
        simpleKdc.getKadmin().exportKeytab(keytabFile, principal);
    }
}