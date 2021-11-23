@org.junit.Before
public void before() {
    if ((entityClient) == null) {
        io.robe.admin.rest.http.HttpRequest authRequest = new io.robe.admin.rest.http.HttpRequestImpl(io.robe.admin.RobeAdminTest.getCookie());
        entityClient = new io.robe.admin.rest.RobeRestClient(authRequest, getClazz(), getPath());
    }
}