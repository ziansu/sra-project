private java.lang.reflect.Method getBestMatchingMethod(java.lang.Object o, java.lang.String methodName, java.lang.Class[] parameterClasses) throws java.lang.NoSuchMethodException {
    java.lang.reflect.Method method = null;
    boolean hasMatch;
    for (java.lang.Class c : parameterClasses) {
        hasMatch = true;
        try {
            method = o.getClass().getMethod(methodName, c);
        } catch (java.lang.NoSuchMethodException e) {
            hasMatch = false;
        }
        if (hasMatch)
            break;
        
    }
    if (method == null)
        throw new java.lang.NoSuchMethodException(("No Such Method: " + methodName));
    
    return method;
}