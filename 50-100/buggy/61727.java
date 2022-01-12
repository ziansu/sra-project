private boolean checkAnnotated(edu.umd.cs.findbugs.ba.XMethod bcelMethod) {
    for (edu.umd.cs.findbugs.classfile.analysis.AnnotationValue annotation : bcelMethod.getAnnotations()) {
        java.lang.String type = annotation.getAnnotationClass().getSignature();
        if ("Lcom/google/common/annotations/VisibleForTesting;".equals(type)) {
            return true;
        }
    }
    return false;
}