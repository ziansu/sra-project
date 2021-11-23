public de.gmcs.builder.GenericBuilder<T> with(java.lang.String methodName, java.lang.Object... propertyValues) throws de.gmcs.builder.GenericBuilderException {
    try {
        java.lang.Class<T>[] parameterTypes = de.gmcs.builder.GenericBuilder.getParameterTypes(propertyValues);
        java.lang.reflect.Method method = clazz.getMethod(methodName, parameterTypes);
        method.invoke(instance, propertyValues);
        return this;
    } catch (java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e) {
        throw new de.gmcs.builder.GenericBuilderException(e);
    }
}