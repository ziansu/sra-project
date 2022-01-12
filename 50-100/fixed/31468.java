@org.junit.Before
public void init() {
    secret = "65455ecrvrdytfyg6rr".getBytes();
    org.mockito.MockitoAnnotations.initMocks(this);
    org.mockito.Mockito.when(settings.getTokenSigningKey()).thenReturn(secret);
    org.mockito.Mockito.when(settings.getTokenExpirationTime()).thenReturn(15);
    org.mockito.Mockito.when(settings.getTokenRefreshTime()).thenReturn(60);
    org.mockito.Mockito.when(settings.getTokenIssuer()).thenReturn("feede");
    mvc = org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup(controller).build();
}