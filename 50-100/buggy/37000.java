@java.lang.Override
public void visit(int version, int access, java.lang.String name, java.lang.String signature, java.lang.String superName, java.lang.String[] interfaces) {
    com.google.common.base.Preconditions.checkArgument(com.google.devtools.build.android.desugar.BitFlags.isSet(access, Opcodes.ACC_INTERFACE));
    com.google.common.base.Preconditions.checkState(((this.interfaces) == null));
    this.interfaces = com.google.common.collect.ImmutableList.copyOf(interfaces);
    interfaceName = name;
}