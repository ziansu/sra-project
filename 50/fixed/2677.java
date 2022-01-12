@java.lang.Override
public java.lang.Void visitArray(org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedArrayType type, java.lang.Void aVoid) {
    type.replaceAnnotation(org.checkerframework.checker.minlen.MinLenAnnotatedTypeFactory.createMinLen(0));
    return super.visitArray(type, aVoid);
}