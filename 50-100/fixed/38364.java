@org.junit.Test
public void handleRedirectAttributesWithoutRedirect() throws java.lang.Exception {
    org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap redirectAttributes = new org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap();
    mavContainer.setRedirectModel(redirectAttributes);
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView();
    handler.handleReturnValue(mav, returnParamModelAndView, mavContainer, webRequest);
    org.springframework.ui.ModelMap model = mavContainer.getModel();
    assertEquals(null, mavContainer.getView());
    assertTrue(mavContainer.getModel().isEmpty());
    assertNotSame("RedirectAttributes should not be used if controller doesn't redirect", redirectAttributes, model);
}