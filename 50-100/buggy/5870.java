@java.lang.Override
public void visitLookupSwitchInsn(final org.objectweb.asm.Label dflt, final int[] keys, final org.objectweb.asm.Label[] labels) {
    if ((mv) != null) {
        mv.visitLookupSwitchInsn(dflt, keys, labels);
    }
    execute(Opcodes.LOOKUPSWITCH, 0, null, null);
    this.locals = null;
    this.stack = null;
}