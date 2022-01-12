@org.junit.Before
public void setUp() throws java.lang.Exception {
    this.server = new org.springframework.security.ldap.server.ApacheDSContainer(org.springframework.security.ldap.server.ApacheDSEmbeddedLdifTests.LDAP_ROOT, "classpath:test-server-custom-attribute-types.ldif");
    this.server.setPort(org.springframework.security.ldap.server.ApacheDSEmbeddedLdifTests.LDAP_PORT);
    this.server.afterPropertiesSet();
    this.ldapTemplate = new org.springframework.security.ldap.SpringSecurityLdapTemplate(createLdapContextSource());
}