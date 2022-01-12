@org.junit.Test
public void handleViewReference() throws java.lang.Exception {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("viewName", "attrName", "attrValue");
    handler.handleReturnValue(mav, returnParamModelAndView, mavContainer, webRequest);
    org.junit.Assert.assertEquals("viewName", mavContainer.getView());
    org.junit.Assert.assertEquals("attrValue", mavContainer.getModel().get("attrName"));
}