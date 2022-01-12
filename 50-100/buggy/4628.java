@org.junit.Before
public void setup() throws java.lang.NoSuchMethodException {
    request = org.easymock.EasyMock.createMock(javax.servlet.http.HttpServletRequest.class);
    session = org.easymock.EasyMock.createMock(javax.servlet.http.HttpSession.class);
    authenticatedUserService = org.easymock.EasyMock.createMock(ee.hm.dop.service.useractions.AuthenticatedUserService.class);
    logoutService = org.easymock.EasyMock.createMock(ee.hm.dop.service.login.LogoutService.class);
    context = org.easymock.EasyMock.createMock(javax.ws.rs.container.ContainerRequestContext.class);
    capturedSecurityContext = org.easymock.EasyMock.newCapture();
    capturedResponse = org.easymock.EasyMock.newCapture();
    uriInfo = org.easymock.EasyMock.createMock(javax.ws.rs.core.UriInfo.class);
    filter = new ee.hm.dop.rest.filter.SecurityFilterTest.SecurityFilterMock(uriInfo, request);
}