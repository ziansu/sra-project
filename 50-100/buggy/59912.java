@org.junit.Before
public void setUp() {
    goConfigService = org.mockito.Mockito.mock(com.thoughtworks.go.server.service.GoConfigService.class);
    contextFactory = org.mockito.Mockito.mock(org.springframework.security.ldap.SpringSecurityContextSource.class);
    securityConfig = org.mockito.Mockito.mock(com.thoughtworks.go.config.SecurityConfig.class);
    ldapTemplate = org.mockito.Mockito.mock(org.springframework.ldap.core.LdapTemplate.class);
    logger = org.mockito.Mockito.mock(org.apache.log4j.Logger.class);
    ldapUserSearch = new com.thoughtworks.go.server.security.LdapUserSearch(goConfigService, contextFactory, ldapTemplate, logger);
    org.mockito.Mockito.when(goConfigService.security()).thenReturn(securityConfig);
    spy = org.mockito.Mockito.spy(ldapUserSearch);
}