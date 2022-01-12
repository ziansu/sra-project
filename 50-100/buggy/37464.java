public byte[] Encrypt(java.lang.String word) {
    byte[] ciphertext = null;
    try {
        ciphertext = cipherEncrypt.doFinal(word.getBytes("UTF8"));
    } catch (javax.crypto.IllegalBlockSizeException e) {
        e.printStackTrace();
    } catch (javax.crypto.BadPaddingException e) {
        e.printStackTrace();
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return ciphertext;
}