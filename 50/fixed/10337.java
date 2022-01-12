public boolean isUserAllowedToAccessFile(java.lang.String user, java.lang.String fileName) {
    return (isUiFilterNotSet()) || (isAuthorizedLogUser(user, fileName));
}