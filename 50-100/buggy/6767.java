private java.lang.String decrypt(java.lang.String value) {
    try {
        return com.microsoft.aad.adal.DefaultTokenCacheStore.sHelper.decrypt(value);
    } catch (java.lang.Exception e) {
        com.microsoft.aad.adal.Logger.e(com.microsoft.aad.adal.DefaultTokenCacheStore.TAG, "Decryption failure", "", ADALError.ENCRYPTION_FAILED, e);
        if (!(com.microsoft.aad.adal.StringExtensions.IsNullOrBlank(value))) {
            com.microsoft.aad.adal.Logger.v(com.microsoft.aad.adal.DefaultTokenCacheStore.TAG, java.lang.String.format("Decryption error for key: '%s'. Item will be removed", value));
            removeItem(value);
            com.microsoft.aad.adal.Logger.v(com.microsoft.aad.adal.DefaultTokenCacheStore.TAG, java.lang.String.format("Item removed for key: '%s'", value));
        }
    }
    return null;
}