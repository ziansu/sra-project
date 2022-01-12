private void readVersion() throws java.lang.Exception {
    try (java.io.InputStream verStream = getClass().getClassLoader().getResourceAsStream(com.mobilehelix.appserver.system.VersionManager.versionProperties)) {
        java.util.Properties verProps = new java.util.Properties();
        verProps.load(verStream);
        majorVer = verProps.getProperty("Major");
        minorVer = verProps.getProperty("Minor");
        revisionVer = verProps.getProperty("Revision");
        versionString = ((((majorVer) + ".") + (minorVer)) + ".") + (revisionVer);
    }
}