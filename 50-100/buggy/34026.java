@org.junit.Test
public void handleRedirectAttributesWithViewInstance() throws java.lang.Exception {
    org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap redirectAttributes = new org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap();
    mavContainer.setRedirectModel(redirectAttributes);
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("redirect:viewName", "attrName", "attrValue");
    handler.handleReturnValue(mav, returnParamModelAndView, mavContainer, webRequest);
    org.springframework.ui.ModelMap model = mavContainer.getModel();
    org.junit.Assert.assertEquals("redirect:viewName", mavContainer.getViewName());
    org.junit.Assert.assertEquals("attrValue", model.get("attrName"));
    org.junit.Assert.assertSame("RedirectAttributes should be used if controller redirects", redirectAttributes, model);
}