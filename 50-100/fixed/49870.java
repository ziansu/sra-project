public static <T extends java.lang.annotation.Annotation> T getAnnotation(java.lang.reflect.Member m, java.lang.Class<T> annotationClass) {
    if ((m == null) || (annotationClass == null))
        return null;
    
    if (m instanceof java.lang.reflect.Constructor)
        return ((java.lang.reflect.Constructor<?>) (m)).getAnnotation(annotationClass);
    else
        return ((java.lang.reflect.Method) (m)).getAnnotation(annotationClass);
    
}