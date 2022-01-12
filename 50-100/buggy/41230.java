public static java.lang.String encrypt(java.lang.String data) throws java.lang.Exception {
    java.security.Key key = com.gluo.webchat.maven.utilities.AES.genKey();
    javax.crypto.Cipher c = javax.crypto.Cipher.getInstance(com.gluo.webchat.maven.utilities.AES.algo);
    c.init(javax.crypto.Cipher.ENCRYPT_MODE, key);
    byte[] enc = c.doFinal(data.getBytes());
    java.lang.String encrypted = new sun.misc.BASE64Encoder().encode(enc);
    return encrypted;
}