public static <T extends java.lang.annotation.Annotation> T findAnnotation(java.lang.reflect.AnnotatedElement element, java.lang.Class<T> annotationType) {
    T ann = element.getAnnotation(annotationType);
    if (ann == null) {
        java.util.HashSet<java.lang.Class<? extends java.lang.annotation.Annotation>> visited = new java.util.HashSet<>();
        for (java.lang.annotation.Annotation metaAnn : element.getAnnotations()) {
            ann = org.axonframework.common.annotation.AnnotationUtils.getAnnotation(metaAnn.annotationType(), annotationType, visited);
            if (ann != null) {
                break;
            }
        }
    }
    return ann;
}