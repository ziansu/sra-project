java.lang.String getRemoteUser(javax.servlet.http.HttpServletRequest req) {
    java.lang.String remoteUser = com.google.gerrit.httpd.RemoteUserUtil.getRemoteUser(req, loginHeader);
    return (userNameToLowerCase) && (remoteUser != null) ? remoteUser.toLowerCase(java.util.Locale.US) : remoteUser;
}