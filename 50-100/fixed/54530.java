public static <T extends java.lang.annotation.Annotation> T getParameterAnnotation(java.lang.reflect.Method method, int param, java.lang.Class<T> annotationClass) {
    java.lang.annotation.Annotation[][] annotations = com.github.kubatatami.judonetworking.utils.ReflectionCache.getParameterAnnotations(method);
    for (java.lang.annotation.Annotation annotation : annotations[param]) {
        if (annotationClass.isInstance(annotation)) {
            return ((T) (annotation));
        }
    }
    return null;
}