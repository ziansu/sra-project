@org.junit.Test
public void resolveProvidedArgFirst() throws java.lang.Exception {
    org.springframework.web.method.support.StubArgumentResolver intResolver = new org.springframework.web.method.support.StubArgumentResolver(java.lang.Integer.class, 1);
    org.springframework.web.method.support.StubArgumentResolver stringResolver = new org.springframework.web.method.support.StubArgumentResolver(java.lang.String.class, "value1");
    org.springframework.web.method.support.HandlerMethodArgumentResolverComposite composite = new org.springframework.web.method.support.HandlerMethodArgumentResolverComposite();
    composite.addResolver(intResolver);
    composite.addResolver(stringResolver);
    handlerMethod.setHandlerMethodArgumentResolvers(composite);
    java.lang.Object returnValue = handlerMethod.invokeForRequest(webRequest, null, 2, "value2");
    org.junit.Assert.assertEquals("2-value2", returnValue);
}