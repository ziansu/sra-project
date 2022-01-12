public java.lang.String decrypt(java.lang.String cipherText) {
    try {
        return new java.lang.String(decryptCipher.doFinal(org.jivesoftware.smack.util.stringencoder.java7.Base64.decode(cipherText)), "UTF-8");
    } catch (javax.crypto.IllegalBlockSizeException e) {
        e.printStackTrace();
    } catch (javax.crypto.BadPaddingException e) {
        e.printStackTrace();
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return null;
}