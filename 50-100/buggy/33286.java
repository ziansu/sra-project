@org.junit.Test
public void shouldFilterForMatchingUsernamesInSearchBase() throws java.lang.Exception {
    ldapUserSearch.search("username", ldapConfig(new com.thoughtworks.go.config.server.security.ldap.BasesConfig(new com.thoughtworks.go.config.server.security.ldap.BaseConfig("base1"))));
    org.mockito.Mockito.verify(ldapTemplate).search(org.mockito.Matchers.argThat(org.hamcrest.Matchers.is("base1")), org.mockito.Matchers.anyString(), org.mockito.Matchers.any(javax.naming.directory.SearchControls.class), org.mockito.Matchers.any(org.springframework.ldap.core.AttributesMapperCallbackHandler.class));
}