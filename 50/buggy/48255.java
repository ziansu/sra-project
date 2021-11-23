@java.lang.Override
public void visitLdcInsn(java.lang.Object cst) {
    recognizer.advance(fr.inria.stamp.mutationtest.descartes.bodyanalysis.Type.getType(cst.getClass()).getOpcode(Opcodes.LDC));
}