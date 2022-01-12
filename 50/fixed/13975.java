protected boolean updateTime(java.lang.String appName) {
    return appFile(appName, org.onosproject.common.app.ApplicationArchive.APP_XML).setLastModified(java.lang.System.currentTimeMillis());
}