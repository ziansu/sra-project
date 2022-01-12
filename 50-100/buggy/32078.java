@org.junit.Test
public void testGuestUsersShallNotPass() {
    fi.nls.oskari.control.ActionParameters params = new fi.nls.oskari.control.ActionParameters();
    params.setRequest(mockHttpServletRequest("GET", null, null));
    params.setResponse(mockHttpServletResponse(null));
    params.setUser(getGuestUser());
    try {
        fi.nls.oskari.control.admin.ViewsHandlerTest.views.handleAction(params);
        org.junit.Assert.fail("ActionDeniedException should have been thrown");
    } catch (fi.nls.oskari.control.ActionException e) {
        org.junit.Assert.assertEquals("Admin only", e.getMessage());
    }
}