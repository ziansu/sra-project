@org.junit.Test
public void handleViewInstance() throws java.lang.Exception {
    org.springframework.web.servlet.ModelAndView mav = new org.springframework.web.servlet.ModelAndView(new org.springframework.web.servlet.view.RedirectView(), "attrName", "attrValue");
    handler.handleReturnValue(mav, returnParamModelAndView, mavContainer, webRequest);
    org.junit.Assert.assertEquals(org.springframework.web.servlet.view.RedirectView.class, mavContainer.getView().getClass());
    org.junit.Assert.assertEquals("attrValue", mavContainer.getModel().get("attrName"));
}