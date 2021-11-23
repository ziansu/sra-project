public javax.lang.model.element.AnnotationMirror createMinLen(int val) {
    org.checkerframework.framework.util.AnnotationBuilder builder = new org.checkerframework.framework.util.AnnotationBuilder(processingEnv, org.checkerframework.checker.minlen.MinLen.class);
    builder.setValue("value", val);
    return builder.build();
}