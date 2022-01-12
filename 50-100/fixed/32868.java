private java.lang.String decrypt(java.lang.String s) {
    try {
        java.security.Key key = getKey();
        javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
        c.init(javax.crypto.Cipher.DECRYPT_MODE, key);
        byte[] dec = c.doFinal(s.getBytes());
        return new java.lang.String(dec);
    } catch (java.lang.Exception e) {
        return null;
    }
}