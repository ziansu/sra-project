@java.lang.Override
public void visitType(java.lang.reflect.Type type) {
    final spoon.reflect.reference.CtTypeReference<?> ctTypeReference = factory.Core().createTypeReference();
    enter(new spoon.support.visitor.java.internal.TypeReferenceRuntimeBuilderContext(ctTypeReference));
    ctTypeReference.setSimpleName(getTypeName(type));
    super.visitType(type);
    exit();
    contexts.peek().addTypeName(ctTypeReference);
}