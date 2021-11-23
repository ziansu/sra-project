@org.junit.Test
public void testGuestUsersShallNotPass() {
    fi.nls.oskari.control.ActionParameters params = new fi.nls.oskari.control.ActionParameters();
    params.setRequest(mockHttpServletRequest());
    params.setResponse(mockHttpServletResponse());
    params.setUser(getGuestUser());
    try {
        fi.nls.oskari.control.admin.ViewsHandlerTest.views.handleAction(params);
        fail("ActionDeniedException should have been thrown");
    } catch (fi.nls.oskari.control.ActionException e) {
        assertEquals("Admin only", e.getMessage());
    }
}