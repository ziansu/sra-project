private final java.lang.Object getAnnotation(java.lang.Class<?> target) {
    for (java.lang.Class<? extends java.lang.annotation.Annotation> annotationType : annotationTypes) {
        java.lang.Object[] potentialAnnotation = target.getAnnotationsByType(annotationType);
        if ((potentialAnnotation.length) > 0) {
            return potentialAnnotation[0];
        }
    }
    return null;
}