private static boolean nodeExists(java.lang.String key) {
    return (java.util.prefs.Preferences.userNodeForPackage(com.pepperonas.jxaesprefs.AesPrefs.mClazz).get(key, null)) != null;
}