private static boolean isIgnored(@javax.annotation.Nonnull
final edu.umd.cs.findbugs.classfile.analysis.AnnotatedObject ao, @javax.annotation.Nonnull
final java.lang.String error) {
    final edu.umd.cs.findbugs.classfile.analysis.AnnotationValue suppressAnnotation = ao.getAnnotation(com.monits.findbugs.effectivejava.ToStringDetector.SUPPRESS_FB_WARNING_CD);
    if (suppressAnnotation != null) {
        final java.lang.Object[] values = ((java.lang.Object[]) (suppressAnnotation.getValue("value")));
        for (final java.lang.Object v : values) {
            if (error.equals(v)) {
                return true;
            }
        }
    }
    return false;
}