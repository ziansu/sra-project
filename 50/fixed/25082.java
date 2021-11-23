public void setPassword(com.example.myapp.login.db.User u, java.lang.String unencryptedPassword) {
    u.setEncryptedPassword(getEncryptedPassword(unencryptedPassword));
}