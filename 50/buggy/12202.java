@java.lang.Override
public void visitVarInsn(final int opcode, final int var) {
    if ((mv) != null) {
        mv.visitVarInsn(opcode, var);
    }
    execute(opcode, var, null, null);
}