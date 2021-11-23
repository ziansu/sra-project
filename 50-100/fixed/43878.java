@java.lang.Override
public byte[] encrypt(byte[] key, byte[] input, int offset, int len) throws com.beef.util.bouncycastle.CryptoException {
    checkKeyLen(key);
    try {
        javax.crypto.SecretKey secretKey = new javax.crypto.spec.SecretKeySpec(key, "AES");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(input, offset, len);
    } catch (java.lang.Throwable e) {
        throw new com.beef.util.bouncycastle.CryptoException(e);
    }
}