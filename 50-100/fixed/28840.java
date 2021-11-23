private org.springframework.ldap.core.support.LdapContextSource getDefaultContextSource() {
    org.springframework.security.ldap.DefaultSpringSecurityContextSource ldapContextSource = new org.springframework.security.ldap.DefaultSpringSecurityContextSource(java.util.Arrays.asList(com.erudika.para.security.SimpleLdapAuthenticator.SERVER_URL), com.erudika.para.security.SimpleLdapAuthenticator.BASE_DN);
    ldapContextSource.setAuthenticationSource(new org.springframework.security.ldap.authentication.SpringSecurityAuthenticationSource());
    ldapContextSource.setCacheEnvironmentProperties(false);
    if (!(com.erudika.para.security.SimpleLdapAuthenticator.BIND_DN.isEmpty())) {
        ldapContextSource.setUserDn(com.erudika.para.security.SimpleLdapAuthenticator.BIND_DN);
    }
    if (!(com.erudika.para.security.SimpleLdapAuthenticator.BIND_PASS.isEmpty())) {
        ldapContextSource.setPassword(com.erudika.para.security.SimpleLdapAuthenticator.BIND_PASS);
    }
    return ldapContextSource;
}