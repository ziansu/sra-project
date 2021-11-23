@org.junit.Test
public void exceptionInResolvingArg() throws java.lang.Exception {
    org.springframework.web.method.support.HandlerMethodArgumentResolverComposite composite = new org.springframework.web.method.support.HandlerMethodArgumentResolverComposite();
    composite.addResolver(new org.springframework.web.method.support.InvocableHandlerMethodTests.ExceptionRaisingArgumentResolver());
    handlerMethod.setHandlerMethodArgumentResolvers(composite);
    try {
        handlerMethod.invokeForRequest(webRequest, null);
        fail("Expected exception");
    } catch (org.springframework.http.converter.HttpMessageNotReadableException ex) {
    }
}