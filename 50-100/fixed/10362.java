public void addUser(final java.lang.String iName, java.lang.String iPassword, final java.lang.String iPermissions) throws java.io.IOException {
    if (iPassword == null)
        iPassword = com.orientechnologies.orient.core.security.OSecurityManager.instance().digest2String(java.lang.String.valueOf(random.nextLong()), false);
    
    iPassword = com.orientechnologies.orient.core.security.OSecurityManager.instance().digest2String(iPassword, true);
    serverCfg.setUser(iName, iPassword, iPermissions);
    serverCfg.saveConfiguration();
}