@org.junit.Test
public void handleNull() throws java.lang.Exception {
    handler.handleReturnValue(null, returnParamModelAndView, mavContainer, webRequest);
    assertTrue(mavContainer.isRequestHandled());
}