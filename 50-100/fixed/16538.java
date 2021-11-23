public static com.barrieault.budgettabs.User checkUserAndPass(java.util.ArrayList<com.barrieault.budgettabs.User> users, java.lang.String username, java.lang.String password) {
    org.jasypt.util.password.BasicPasswordEncryptor passwordEncryptor = new org.jasypt.util.password.BasicPasswordEncryptor();
    for (com.barrieault.budgettabs.User u : users) {
        if (u.getUsername().equalsIgnoreCase(username)) {
            if (password.equals(u.getPassword())) {
                return u;
            }
        }
    }
    return null;
}