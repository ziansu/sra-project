private java.lang.String encrypt(java.lang.String s) {
    try {
        java.security.Key key = getKey();
        javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
        c.init(javax.crypto.Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(s.getBytes());
        return new java.lang.String(enc);
    } catch (java.lang.Exception e) {
        return null;
    }
}