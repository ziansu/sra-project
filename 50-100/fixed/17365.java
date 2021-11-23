@java.lang.Override
public void visitTableSwitchInsn(final int min, final int max, final org.objectweb.asm.Label dflt, final org.objectweb.asm.Label... labels) {
    if ((mv) != null) {
        mv.visitTableSwitchInsn(min, max, dflt, labels);
    }
    execute(Opcodes.TABLESWITCH, 0, 0, null, null);
    this.locals = null;
    this.stack = null;
}