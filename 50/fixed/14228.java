@java.lang.Override
public void visitMultiANewArrayInsn(final java.lang.String desc, final int dims) {
    if ((mv) != null) {
        mv.visitMultiANewArrayInsn(desc, dims);
    }
    execute(Opcodes.MULTIANEWARRAY, dims, 0, desc, null);
}