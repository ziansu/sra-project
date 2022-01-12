static java.lang.Object getEnumValue(final java.lang.Class<?> enumType, final java.lang.String name) throws java.lang.ReflectiveOperationException {
    final java.lang.Object result;
    if (enumType != null) {
        final java.lang.reflect.Method method = enumType.getDeclaredMethod("valueOf", java.lang.String.class);
        result = method.invoke(enumType, name);
    }else {
        result = null;
    }
    return result;
}