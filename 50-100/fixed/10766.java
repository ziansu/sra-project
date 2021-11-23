private void extendProgram() {
    notNullVariables.set(0);
    insertAdditionalVariables();
    org.teavm.model.Variable[] parameters = new org.teavm.model.Variable[(methodDescriptor.parameterCount()) + 1];
    for (int i = 0; i < (parameters.length); ++i) {
        parameters[i] = program.variableAt(i);
    }
    phiUpdater = new org.teavm.model.util.PhiUpdater();
    phiUpdater.updatePhis(program, parameters);
    collectAdditionalVariables();
}