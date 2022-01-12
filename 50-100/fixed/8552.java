private void invokeExceptionRaisingHandler(java.lang.Throwable expected) throws java.lang.Exception {
    java.lang.reflect.Method method = org.springframework.web.method.support.InvocableHandlerMethodTests.ExceptionRaisingHandler.class.getDeclaredMethod("raiseException");
    java.lang.Object handler = new org.springframework.web.method.support.InvocableHandlerMethodTests.ExceptionRaisingHandler(expected);
    new org.springframework.web.method.support.InvocableHandlerMethod(handler, method).invokeForRequest(webRequest, null);
    fail("Expected exception");
}