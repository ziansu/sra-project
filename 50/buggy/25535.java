private javax.lang.model.element.AnnotationMirror createMinLenBottom() {
    org.checkerframework.framework.util.AnnotationBuilder builder = new org.checkerframework.framework.util.AnnotationBuilder(processingEnv, org.checkerframework.checker.minlen.MinLenBottom.class);
    return builder.build();
}