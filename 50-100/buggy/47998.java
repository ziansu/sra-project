public java.io.InputStream decryptContent(java.lang.String seed, byte[] key) {
    try {
        byte[] iv = getIv(seed);
        byte[] encryptedIv = cryptoHelper.encryptIv(iv, key);
        byte[] newKey = java.util.Arrays.copyOf(encryptedIv, ((net.lexcrypta.core.crypto.CryptoHelper.KEY_LENGTH) / 8));
        byte[] id = encryptString(seed, iv, newKey);
        return getContentFromFileSystem(id, iv, key);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}