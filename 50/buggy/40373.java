private java.lang.String getListenerUser(domain.model.users.User user) {
    java.lang.String ret = null;
    try {
        ret = helpers.MD5.encrypt(user.getUsername());
    } catch (java.security.NoSuchAlgorithmException | java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return ret;
}