public boolean isUserAllowedToAccessFile(java.lang.String fileName, java.lang.String user) {
    return (isUiFilterNotSet()) || (isAuthorizedLogUser(user, fileName));
}