@java.lang.Override
public org.acegisecurity.userdetails.UserDetails loadUserByUsername(java.lang.String username) throws org.acegisecurity.userdetails.UsernameNotFoundException, org.springframework.dao.DataAccessException {
    if ((org.apache.commons.lang.StringUtils.isBlank(getQueryUser())) || ((getQueryPassword()) == null)) {
        return null;
    }
    javax.naming.ldap.LdapContext ctx = connectToLdap(getQueryUser(), getQueryPassword());
    return createUserDetails(ctx, username, false);
}