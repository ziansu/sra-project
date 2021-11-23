public static boolean contains(java.lang.String key) {
    java.util.prefs.Preferences sp = java.util.prefs.Preferences.userNodeForPackage(com.pepperonas.jxaesprefs.AesPrefs.mClazz);
    java.lang.String encryptedKey = com.pepperonas.jxaesprefs.utils.Crypt.encrypt(com.pepperonas.jxaesprefs.AesPrefs.mPassword, key, com.pepperonas.jxaesprefs.AesPrefs.mIv);
    return com.pepperonas.jxaesprefs.AesPrefs.nodeExists(sp, encryptedKey);
}