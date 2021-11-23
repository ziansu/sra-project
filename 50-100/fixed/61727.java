private boolean checkAnnotated(@javax.annotation.Nonnull
final edu.umd.cs.findbugs.ba.XMethod bcelMethod) {
    for (final edu.umd.cs.findbugs.classfile.analysis.AnnotationValue annotation : bcelMethod.getAnnotations()) {
        final java.lang.String type = annotation.getAnnotationClass().getSignature();
        if ("Lcom/google/common/annotations/VisibleForTesting;".equals(type)) {
            return true;
        }
    }
    return false;
}