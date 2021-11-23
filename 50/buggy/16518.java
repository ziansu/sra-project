@java.lang.Override
public java.lang.String getRemoteUser(javax.servlet.http.HttpServletRequest request) {
    java.lang.String remoteUser = super.getRemoteUser(request);
    if (isUserEnabled(remoteUser)) {
        return remoteUser;
    }else {
        return null;
    }
}