@java.lang.SuppressWarnings(value = "unchecked")
private boolean methodOverridden(java.lang.Class beanClass, java.lang.reflect.Method methodOfCurrentClass) {
    java.lang.String methodName = methodOfCurrentClass.getName();
    java.lang.Class<?>[] methodParams = methodOfCurrentClass.getParameterTypes();
    java.lang.Class<?> declaringClass = methodOfCurrentClass.getDeclaringClass();
    try {
        return !(beanClass.getMethod(methodName, methodParams).getDeclaringClass().equals(declaringClass));
    } catch (java.lang.NoSuchMethodException ignored) {
    }
    return false;
}