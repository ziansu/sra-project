@java.lang.Override
public void visitTypeVariable(final java.lang.String name) {
    if (((type) != (org.objectweb.asm.util.CheckSignatureAdapter.TYPE_SIGNATURE)) || ((state) != (org.objectweb.asm.util.CheckSignatureAdapter.EMPTY))) {
        throw new java.lang.IllegalStateException();
    }
    checkIdentifier(name, "type variable");
    state = org.objectweb.asm.util.CheckSignatureAdapter.SIMPLE_TYPE;
    if ((sv) != null) {
        sv.visitTypeVariable(name);
    }
}