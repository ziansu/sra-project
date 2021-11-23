@org.junit.Before
public void setup() {
    goConfigService = org.mockito.Mockito.mock(com.thoughtworks.go.server.service.GoConfigService.class);
    securityService = org.mockito.Mockito.mock(com.thoughtworks.go.server.service.SecurityService.class);
    entityHashingService = org.mockito.Mockito.mock(com.thoughtworks.go.server.service.EntityHashingService.class);
    service = new com.thoughtworks.go.server.service.TemplateConfigService(goConfigService, securityService, entityHashingService);
}