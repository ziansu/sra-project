@org.junit.Test
public void handleViewReference() throws java.lang.Exception {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView("viewName", "attrName", "attrValue");
    handler.handleReturnValue(mav, returnParamModelAndView, mavContainer, webRequest);
    assertEquals("viewName", mavContainer.getView());
    assertEquals("attrValue", mavContainer.getModel().get("attrName"));
}