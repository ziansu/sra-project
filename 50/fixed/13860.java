@org.junit.Test
public void supportsReturnType() throws java.lang.Exception {
    assertTrue(handler.supportsReturnType(returnParamModelAndView));
    assertFalse(handler.supportsReturnType(getReturnValueParam("viewName")));
}