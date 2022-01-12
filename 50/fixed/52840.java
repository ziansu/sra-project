@java.lang.Override
public generator.Instruction visitEndProgram(parsetree.stats.EndProgram node) {
    return addInstruction(new parsetree.stats.EndProgram());
}