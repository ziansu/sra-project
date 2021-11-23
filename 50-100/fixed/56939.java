private final java.lang.Object getAnnotation(java.lang.Class<?> target) {
    for (java.lang.Class<? extends java.lang.annotation.Annotation> annotationType : annotationTypes) {
        java.lang.annotation.Annotation potentialAnnotation = target.getAnnotation(annotationType);
        if (potentialAnnotation != null) {
            return potentialAnnotation;
        }
    }
    return null;
}