public static com.google.common.base.Optional<java.lang.annotation.Annotation> findAnyAnnotationAnnotatedWith(java.lang.annotation.Annotation[] annotations, java.lang.Class<? extends java.lang.annotation.Annotation> annotatedWith) {
    for (java.lang.annotation.Annotation annotation : annotations) {
        if (annotation.annotationType().isAnnotationPresent(annotatedWith)) {
            return com.google.common.base.Optional.of(annotation);
        }
    }
    return com.google.common.base.Optional.absent();
}