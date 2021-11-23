@java.lang.Override
public void visitMethodInsn(int opcode, java.lang.String owner, java.lang.String name, java.lang.String desc) {
    if (owner.equals(net.sf.jsslkeylog.LogWriter.class.getName().replace('.', '/'))) {
        owner = className;
        name = "$LogWriter$" + name;
    }
    super.visitMethodInsn(opcode, owner, name, desc, false);
}