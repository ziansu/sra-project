public void addUser(final java.lang.String iName, java.lang.String iPassword, final java.lang.String iPermissions) throws java.io.IOException {
    if (iPassword == null)
        iPassword = com.orientechnologies.orient.core.security.OSecurityManager.instance().digest2String(java.lang.String.valueOf(random.nextLong()), false);
    
    serverCfg.setUser(iName, iPassword, iPermissions);
    serverCfg.saveConfiguration();
}