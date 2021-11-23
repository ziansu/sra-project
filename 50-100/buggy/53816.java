@java.lang.Override
public void visitFieldInsn(final int opcode, final java.lang.String owner, final java.lang.String name, final java.lang.String desc) {
    if ((mv) != null) {
        mv.visitFieldInsn(opcode, owner, name, desc);
    }
    execute(opcode, 0, desc, name);
}