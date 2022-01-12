@java.lang.Override
public net.bytebuddy.pool.AnnotationVisitor visitAnnotation(java.lang.String descriptor, boolean visible) {
    return new net.bytebuddy.pool.TypePool.Default.TypeExtractor.AnnotationExtractor(descriptor, annotationTokens, new net.bytebuddy.pool.TypePool.Default.ComponentTypeLocator.ForAnnotationProperty(this, descriptor));
}