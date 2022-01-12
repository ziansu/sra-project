protected java.lang.reflect.Method getMethodToInvoke(java.lang.reflect.Method decodedMethod) throws java.lang.NoSuchMethodException {
    java.lang.reflect.Method method = methodCache.get(decodedMethod);
    if (method != null)
        return method;
    
    method = org.gwtwidgets.server.spring.ReflectionUtils.getRPCMethod(service, serviceInterfaces, decodedMethod);
    return methodCache.put(decodedMethod, method);
}