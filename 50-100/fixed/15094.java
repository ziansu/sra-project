@java.lang.Override
public void visitMethodInsn(int opcode, java.lang.String owner, java.lang.String name, java.lang.String desc) {
    super.visitMethodInsn(opcode, remapper.map(owner), remapper.mapMethodName(remapper.map(owner), name, desc), remapper.mapMethodDesc(desc));
}