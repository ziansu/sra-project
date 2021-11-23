@java.lang.Override
public void visitIntInsn(final int opcode, final int operand) {
    if ((mv) != null) {
        mv.visitIntInsn(opcode, operand);
    }
    execute(opcode, operand, 0, null, null);
}