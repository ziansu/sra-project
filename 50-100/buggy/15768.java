protected boolean isUserDisabled(javax.naming.directory.SearchResult result) throws javax.naming.NamingException {
    boolean isDisabledUser = false;
    java.lang.String userAccountControl = org.apache.cloudstack.ldap.LdapUtils.getAttributeValue(result.getAttributes(), _ldapConfiguration.getUserAccountControlAttribute());
    if (userAccountControl != null) {
        int control = java.lang.Integer.valueOf(userAccountControl);
        if ((control & 2) > 0) {
            isDisabledUser = true;
        }
    }
    return isDisabledUser;
}