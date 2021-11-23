public static java.lang.reflect.Type getGetterReturnType(final java.lang.Class<?> classConnector, final java.lang.String getterName) throws org.bonitasoft.engine.commons.exceptions.SReflectException {
    java.lang.reflect.Method m;
    try {
        m = org.bonitasoft.engine.commons.ClassReflector.getMethod(classConnector, getterName);
    } catch (final java.lang.Exception e) {
        throw new org.bonitasoft.engine.commons.exceptions.SReflectException(e);
    }
    return m.getGenericReturnType();
}