private java.lang.reflect.Method getBestMatchingMethod(java.lang.Object o, java.lang.String methodName, java.lang.Class<?>[] parameterClasses) throws java.lang.NoSuchMethodException {
    java.lang.reflect.Method method = null;
    for (java.lang.Class<?> c : parameterClasses) {
        method = getMethod(o, methodName, c);
        if (method != null)
            break;
        
    }
    if (method == null)
        throw new java.lang.NoSuchMethodException(("No Such Method: " + methodName));
    
    return method;
}