@java.lang.Override
public void configure() throws java.lang.Exception {
    if (hdfsEnableRunningUserAsProxyUser) {
        hdfsConfig.set((("hadoop.proxyuser." + (java.lang.System.getProperty("user.name"))) + ".hosts"), "*");
        hdfsConfig.set((("hadoop.proxyuser." + (java.lang.System.getProperty("user.name"))) + ".groups"), "*");
    }
    hdfsConfig.setBoolean("dfs.permissions", hdfsEnablePermissions);
    java.lang.System.setProperty("test.build.data", hdfsTempDir);
}