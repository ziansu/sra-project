@Kroll.method
public java.lang.String generateDerivedKey(java.lang.String seed) {
    try {
        java.lang.String genKey = bencoding.securely.AESCrypto.getRawKey(seed.getBytes()).toString();
        return genKey;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        bencoding.securely.LogHelpers.Log(e);
        return null;
    }
}