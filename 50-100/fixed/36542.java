@org.junit.Before
@java.lang.SuppressWarnings(value = "unchecked")
public void setUp() throws java.lang.Exception {
    this.testee = new io.neba.core.sling.AdministrativeResourceResolver();
    doReturn(this.resolver).when(this.factory).getAdministrativeResourceResolver(((java.util.Map<java.lang.String, java.lang.Object>) (org.mockito.Matchers.any())));
    doReturn(true).when(this.resolver).isLive();
}