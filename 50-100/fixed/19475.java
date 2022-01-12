private com.google.common.collect.ImmutableSetMultimap<javax.lang.model.element.ExecutableElement, java.lang.String> allMethodExcludedAnnotations(java.lang.Iterable<javax.lang.model.element.ExecutableElement> methods) {
    com.google.common.collect.ImmutableSetMultimap.Builder<javax.lang.model.element.ExecutableElement, java.lang.String> result = com.google.common.collect.ImmutableSetMultimap.builder();
    for (javax.lang.model.element.ExecutableElement method : methods) {
        result.putAll(method, getFieldOfClasses(method, AutoValue.CopyAnnotations.class, "exclude", processingEnv.getElementUtils()));
    }
    return result.build();
}