private java.lang.annotation.Annotation[] merge(java.lang.annotation.Annotation[] annotations, java.lang.annotation.Annotation[] annotations2) {
    java.util.Set<java.lang.annotation.Annotation> mergedAnnotations = new java.util.HashSet<java.lang.annotation.Annotation>();
    mergedAnnotations.addAll(java.util.Arrays.asList(annotations));
    mergedAnnotations.addAll(java.util.Arrays.asList(annotations2));
    return mergedAnnotations.toArray(new java.lang.annotation.Annotation[0]);
}