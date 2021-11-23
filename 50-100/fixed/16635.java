public static java.lang.annotation.Annotation findAnnotation(java.lang.reflect.AnnotatedElement element, java.lang.String annotationType) {
    java.lang.annotation.Annotation ann = org.axonframework.common.annotation.AnnotationUtils.getAnnotation(element, annotationType);
    if (ann == null) {
        java.util.Set<java.lang.String> visited = new java.util.HashSet<>();
        for (java.lang.annotation.Annotation metaAnn : element.getAnnotations()) {
            ann = org.axonframework.common.annotation.AnnotationUtils.getAnnotation(metaAnn.annotationType(), annotationType, visited);
            if (ann != null) {
                break;
            }
        }
    }
    return ann;
}