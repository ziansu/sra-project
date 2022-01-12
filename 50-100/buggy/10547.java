@org.junit.Test
public void testResultReturnsModelAndView() throws java.lang.Exception {
    org.springframework.mock.web.MockHttpSession session = new org.springframework.mock.web.MockHttpSession();
    org.springframework.web.servlet.ModelAndView actual = portal.result(session, "", "", "");
    org.junit.Assert.assertEquals("result", actual.getViewName());
    org.junit.Assert.assertEquals(null, actual.getModel().get("themes"));
    org.junit.Assert.assertEquals("", actual.getModel().get("query"));
}