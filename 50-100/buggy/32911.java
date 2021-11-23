public static <T extends java.lang.annotation.Annotation> java.util.Optional<T> getTypeAnnotation(java.lang.Class<T> annotationClass, org.junit.gen5.api.extension.MethodInvocationContext mic) {
    log.trace("getTypeAnnotation()");
    java.lang.reflect.Method method = mic.getMethod();
    java.lang.Class<?> type = method.getDeclaringClass();
    log.debug("Type class: {}", type.getName());
    return com.selesy.testing.uprest.utilities.AnnotationReflectionUtility.getOptionalAnnotation(annotationClass, method);
}