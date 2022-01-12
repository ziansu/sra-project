@java.lang.Override
public void visitLocalVariable(java.lang.String name, java.lang.String desc, java.lang.String signature, org.objectweb.asm.Label start, org.objectweb.asm.Label end, int index) {
    super.visitLocalVariable(name, desc, signature, start, end, index);
    scopes.add(new hu.advancedweb.scott.instrumentation.transformation.LocalVariableScopeExtractorTestMethodVisitor.LocalVariableScopeLabels(index, name, desc, start, end));
}