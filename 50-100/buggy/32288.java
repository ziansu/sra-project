public static java.lang.String encrypt(java.lang.String plainText, javax.crypto.SecretKey secretKey) throws java.lang.Exception {
    byte[] plainTextByte = plainText.getBytes();
    in.tn.mobilepay.util.EncryptionDecryptionAES.cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, secretKey);
    byte[] encryptedByte = in.tn.mobilepay.util.EncryptionDecryptionAES.cipher.doFinal(plainTextByte);
    java.util.Base64.Encoder encoder = java.util.Base64.getEncoder();
    java.lang.String encryptedText = encoder.encodeToString(encryptedByte);
    return encryptedText;
}