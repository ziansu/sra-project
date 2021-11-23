protected com.gruuf.model.User registerAndLogin(java.lang.String emailAddress, java.lang.String password) {
    return registerAndLogin(java.util.Collections.singletonList(emailAddress), password, null, null);
}