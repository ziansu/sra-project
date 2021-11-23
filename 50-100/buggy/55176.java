protected java.lang.String encrypt(byte[] content) {
    java.lang.String result = null;
    try {
        javax.crypto.Cipher aesCipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        aesCipher.init(javax.crypto.Cipher.ENCRYPT_MODE, skey_spec_, org.shadowmask.core.mask.rules.AESCipher.ivspec_);
        result = java.util.Base64.getEncoder().encodeToString(aesCipher.doFinal(content));
        return result;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("There is exception in encrypt!");
    }
}