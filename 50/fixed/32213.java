public boolean userExists(java.lang.String username) {
    if (userDAO.userExists(username)) {
        return true;
    }
    return false;
}