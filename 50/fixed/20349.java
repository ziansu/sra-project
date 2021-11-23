public com.orientechnologies.orient.server.OServerUserConfiguration serverLogin(final java.lang.String iUser, final java.lang.String iPassword, final java.lang.String iResource) {
    if (!(authenticate(iUser, iPassword, iResource)))
        return null;
    
    return getUser(iUser);
}