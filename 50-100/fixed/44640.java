public org.teavm.model.emit.ValueEmitter getElement(org.teavm.model.emit.ValueEmitter index) {
    org.teavm.model.Variable result = pe.getProgram().createVariable();
    org.teavm.model.instructions.GetElementInstruction insn = new org.teavm.model.instructions.GetElementInstruction();
    insn.setArray(variable);
    insn.setIndex(index.variable);
    insn.setReceiver(result);
    pe.addInstruction(insn);
    return pe.var(result);
}