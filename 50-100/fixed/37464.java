public byte[] Encrypt(byte[] b) {
    byte[] ciphertext = null;
    try {
        ciphertext = cipherEncrypt.doFinal(b);
    } catch (javax.crypto.IllegalBlockSizeException e) {
        e.printStackTrace();
    } catch (javax.crypto.BadPaddingException e) {
        e.printStackTrace();
    }
    return ciphertext;
}