public boolean isActiveAccount(java.lang.String username) {
    return uDao.UserActivationStatus(username);
}