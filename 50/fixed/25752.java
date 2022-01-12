public void genCode(org.objectweb.asm.MethodVisitor mv) {
    mv.visitIntInsn(getType().getOpcode(com.sun.xml.internal.ws.org.objectweb.asm.Opcodes.ILOAD), this.idxLVT);
}