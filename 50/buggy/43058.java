java.lang.String prepareInMemoryUser() {
    java.lang.String inMemoryUser = de.interseroh.report.webconfig.SecurityConfig.IN_MEMORY_USER;
    java.lang.String confInMemoryUser = env.getProperty("ldap.inmemory.user");
    if ((confInMemoryUser != null) && (!(confInMemoryUser.equals("")))) {
        inMemoryUser = confInMemoryUser;
    }
    return inMemoryUser;
}