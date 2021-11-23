public boolean doesUsernameExist(java.lang.String username) {
    try {
        findByUsername(username);
        return true;
    } catch (java.lang.Exception ex) {
        return false;
    }
}