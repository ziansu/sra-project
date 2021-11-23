public boolean testPassword(com.example.myapp.login.db.User u, java.lang.String unencryptedPassword) {
    boolean ret = u.getEncryptedPassword().equals(getEncryptedPassword(unencryptedPassword));
    return ret;
}