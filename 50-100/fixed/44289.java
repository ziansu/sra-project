@java.lang.Override
public void visitFormalTypeParameter(final java.lang.String name) {
    if (((type) == (org.objectweb.asm.util.CheckSignatureAdapter.TYPE_SIGNATURE)) || ((((state) != (org.objectweb.asm.util.CheckSignatureAdapter.EMPTY)) && ((state) != (org.objectweb.asm.util.CheckSignatureAdapter.FORMAL))) && ((state) != (org.objectweb.asm.util.CheckSignatureAdapter.BOUND)))) {
        throw new java.lang.IllegalStateException();
    }
    checkIdentifier(name, "formal type parameter");
    state = org.objectweb.asm.util.CheckSignatureAdapter.FORMAL;
    if ((sv) != null) {
        sv.visitFormalTypeParameter(name);
    }
}