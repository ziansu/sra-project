protected static java.lang.String encryptPassword(java.lang.String password) {
    java.lang.String sha1 = "";
    try {
        java.security.MessageDigest crypt = java.security.MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(password.getBytes("UTF-8"));
        sha1 = controller.LoginController.byteToHex(crypt.digest());
    } catch (java.security.NoSuchAlgorithmException e) {
        e.printStackTrace();
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return sha1;
}