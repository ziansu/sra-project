@java.lang.Override
public com.microsoft.aad.adal.TokenCacheItem getItem(java.lang.String key) {
    argumentCheck();
    if (key == null) {
        throw new java.lang.IllegalArgumentException("key");
    }
    if (mPrefs.contains(key)) {
        java.lang.String json = mPrefs.getString(key, "");
        java.lang.String decrypted = decrypt(json);
        if (decrypted != null) {
            return mGson.fromJson(decrypted, com.microsoft.aad.adal.TokenCacheItem.class);
        }
    }
    return null;
}