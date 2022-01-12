@org.junit.Before
public void setUp() {
    goConfigService = mock(com.thoughtworks.go.server.service.GoConfigService.class);
    contextFactory = mock(org.springframework.security.ldap.SpringSecurityContextSource.class);
    securityConfig = mock(com.thoughtworks.go.config.SecurityConfig.class);
    ldapTemplate = mock(org.springframework.ldap.core.LdapTemplate.class);
    logger = mock(org.apache.log4j.Logger.class);
    ldapUserSearch = new com.thoughtworks.go.server.security.LdapUserSearch(goConfigService, contextFactory, ldapTemplate, logger);
    when(goConfigService.security()).thenReturn(securityConfig);
    spy = spy(ldapUserSearch);
}