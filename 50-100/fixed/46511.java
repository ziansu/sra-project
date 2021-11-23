@java.lang.Override
public void visitJumpInsn(final int opcode, final org.objectweb.asm.Label label) {
    if ((mv) != null) {
        mv.visitJumpInsn(opcode, label);
    }
    execute(opcode, 0, 0, null, null);
    if (opcode == (org.objectweb.asm.Opcodes.GOTO)) {
        this.locals = null;
        this.stack = null;
    }
}