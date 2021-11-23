public byte[] decrypt(byte[] input) throws java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, javax.crypto.BadPaddingException, javax.crypto.IllegalBlockSizeException, javax.crypto.ShortBufferException {
    cipher.init(javax.crypto.Cipher.DECRYPT_MODE, key, ivSpec);
    decrypted = new byte[cipher.getOutputSize(input.length)];
    decryptedLength = cipher.update(input, 0, input.length, decrypted, 0);
    decryptedLength += cipher.doFinal(decrypted, decryptedLength);
    return decrypted;
}