@org.junit.Before
@java.lang.SuppressWarnings(value = "unchecked")
public void setUp() throws java.lang.Exception {
    this.testee = new io.neba.core.sling.AdministrativeResourceResolver();
    org.mockito.Mockito.doReturn(this.resolver).when(this.factory).getAdministrativeResourceResolver(((java.util.Map<java.lang.String, java.lang.Object>) (org.mockito.Matchers.any())));
    org.mockito.Mockito.doReturn(true).when(this.resolver).isLive();
}