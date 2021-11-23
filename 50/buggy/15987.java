protected com.gruuf.model.User registerAndLogin(java.lang.String emailAddress, java.lang.String password, java.lang.String firstName, java.lang.String lastName) {
    return registerAndLogin(java.util.Collections.singletonList(emailAddress), password, firstName, lastName);
}