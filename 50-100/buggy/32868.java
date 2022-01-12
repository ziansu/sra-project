private java.lang.String decrypt(java.lang.String s) {
    try {
        java.security.Key key = getKey();
        javax.crypto.Cipher c = javax.crypto.Cipher.getInstance("AES");
        c.init(javax.crypto.Cipher.DECRYPT_MODE, key);
        java.lang.String temp = new java.lang.String(java.util.Base64.getDecoder().decode(s));
        byte[] dec = c.doFinal(temp.getBytes());
        return new java.lang.String(dec);
    } catch (java.lang.Exception e) {
        return null;
    }
}