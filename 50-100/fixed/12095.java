java.lang.String prepareLdapAuth() {
    java.lang.String ldapAuth = "true";
    java.lang.String confLdapAuth = env.getProperty("ldap.authentication");
    if ((confLdapAuth != null) && (!(confLdapAuth.isEmpty()))) {
        ldapAuth = confLdapAuth;
    }
    if ((!(ldapAuth.equalsIgnoreCase("true"))) && (!(ldapAuth.equalsIgnoreCase("false")))) {
        ldapAuth = "true";
    }
    return ldapAuth;
}