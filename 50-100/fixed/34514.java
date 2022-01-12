@java.lang.Override
public java.lang.Void visit(com.d401f17.Visitors.CodeGenerator.NegationNode node) {
    node.getExpression().accept(this);
    org.objectweb.asm.Label f = new org.objectweb.asm.Label();
    mv.visitJumpInsn(com.d401f17.Visitors.CodeGenerator.IFEQ, f);
    mv.visitInsn(com.d401f17.Visitors.CodeGenerator.ICONST_1);
    mv.visitLabel(f);
    mv.visitInsn(com.d401f17.Visitors.CodeGenerator.ICONST_0);
    return null;
}