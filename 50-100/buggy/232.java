@java.lang.Override
public java.util.prefs.Preferences userRoot() {
    if ((userRoot) == null) {
        java.lang.String path = java.lang.System.getProperty(com.tmarsteel.xmlprefs.XMLFilePreferencesFactory.USERROOT_FILE_PROPERTY, null);
        if (path == null) {
            if ((java.io.File.separatorChar) == '\\') {
                path = (java.lang.System.getenv("APPDATA")) + "/Java/prefs.xml";
            }else {
                path = (java.lang.System.getProperty("user.home")) + "/.java/prefs.xml";
            }
        }
        systemRoot = getFilePreferences(path);
    }
    return systemRoot;
}