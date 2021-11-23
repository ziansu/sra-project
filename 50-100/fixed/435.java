@java.lang.Override
public void visitInnerClassType(final java.lang.String name) {
    if ((state) != (org.objectweb.asm.util.CheckSignatureAdapter.CLASS_TYPE)) {
        throw new java.lang.IllegalStateException();
    }
    checkIdentifier(name, "inner class name");
    if ((sv) != null) {
        sv.visitInnerClassType(name);
    }
}