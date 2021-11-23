@org.junit.Test
public void handleNull() throws java.lang.Exception {
    handler.handleReturnValue(null, returnParamModelAndView, mavContainer, webRequest);
    org.junit.Assert.assertTrue(mavContainer.isRequestHandled());
}