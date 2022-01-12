@Kroll.method
public java.lang.String generateDerivedKey(java.lang.String seed) {
    try {
        java.lang.String genKey = new java.lang.String(bencoding.securely.AESCrypto.getRawKey(seed.getBytes()));
        return genKey;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        bencoding.securely.LogHelpers.Log(e);
        return null;
    }
}