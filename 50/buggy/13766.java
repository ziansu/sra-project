private org.teavm.model.util.Variable copyVar(org.teavm.model.util.VariableReader var) {
    return programCopy.variableAt(var.getIndex());
}