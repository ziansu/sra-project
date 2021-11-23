protected boolean isInvokeInit() {
    if (!(instruction.getOpcode().canInitializeReference())) {
        return false;
    }
    org.jf.dexlib2.analysis.ReferenceInstruction instruction = ((org.jf.dexlib2.analysis.ReferenceInstruction) (this.instruction));
    org.jf.dexlib2.iface.reference.Reference reference = instruction.getReference();
    if (reference instanceof org.jf.dexlib2.iface.reference.MethodReference) {
        return ((org.jf.dexlib2.iface.reference.MethodReference) (reference)).getName().equals("<init>");
    }
    return false;
}