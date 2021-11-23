private static java.lang.String getCurrentVersion() {
    java.util.Properties prop = new java.util.Properties();
    try {
        java.io.InputStream is = org.hildan.fxlog.version.VersionChecker.class.getResourceAsStream(org.hildan.fxlog.version.VersionChecker.VERSION_PROPERTIES);
        if (is == null) {
            throw new java.lang.RuntimeException(("Couldn't find " + (org.hildan.fxlog.version.VersionChecker.VERSION_PROPERTIES)));
        }
        prop.load(is);
        return prop.getProperty("version");
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(("Couldn't read " + (org.hildan.fxlog.version.VersionChecker.VERSION_PROPERTIES)), e);
    }
}