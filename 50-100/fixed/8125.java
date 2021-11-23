@org.junit.Before
public void setup() throws java.lang.Exception {
    java.lang.String admin = java.lang.System.getProperty("is.admin.user");
    java.lang.String password = java.lang.System.getProperty("is.admin.passwd");
    am = new eu.supersede.integration.api.security.IFAuthenticationManager(admin, password);
    token = am.getAuthorizationToken(admin, password, "");
}