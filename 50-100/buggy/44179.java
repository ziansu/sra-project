private java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> collectQualifiers(final java.lang.reflect.Field field) {
    final java.util.Set<java.lang.Class<? extends java.lang.annotation.Annotation>> qualifiers = new java.util.HashSet<>();
    for (java.lang.annotation.Annotation an : field.getDeclaredAnnotations()) {
        if ((an.annotationType().getAnnotation(javax.inject.Qualifier.class)) != null) {
            qualifiers.add(an.annotationType());
        }
    }
    return qualifiers;
}