public void genCode(org.objectweb.asm.MethodVisitor mv) {
    right.genCode(mv);
    if ((right) instanceof io.lambdacloud.statement.AssignNode) {
        io.lambdacloud.statement.AssignNode r = ((io.lambdacloud.statement.AssignNode) (right));
        mv.visitIntInsn(getType().getOpcode(com.sun.xml.internal.ws.org.objectweb.asm.Opcodes.ILOAD), r.left.idxLVT);
    }
    mv.visitIntInsn(getType().getOpcode(com.sun.xml.internal.ws.org.objectweb.asm.Opcodes.ISTORE), left.idxLVT);
}