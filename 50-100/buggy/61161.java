@java.lang.Override
public void visitInsn(final int opcode) {
    if ((mv) != null) {
        mv.visitInsn(opcode);
    }
    execute(opcode, 0, null, null);
    if (((opcode >= (org.objectweb.asm.Opcodes.IRETURN)) && (opcode <= (org.objectweb.asm.Opcodes.RETURN))) || (opcode == (org.objectweb.asm.Opcodes.ATHROW))) {
        this.locals = null;
        this.stack = null;
    }
}