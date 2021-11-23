@java.lang.Override
public java.lang.String getString(java.lang.String s, java.lang.String s1) {
    try {
        java.lang.String key = mEncryptionManager.getHashed(s);
        java.lang.String value = mPrefs.getString(key, null);
        if (value != null)
            return mEncryptionManager.decrypt(value);
        
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}