@java.lang.Override
public generator.Instruction visitProgram(parsetree.Program node) throws parser.ParseException {
    variables = node.getVariableScope();
    java.util.List<generator.Instruction> subInstructions = new java.util.LinkedList<>();
    for (parsetree.Node n : node.getStats()) {
        subInstructions.add(visit(n));
    }
    if ((subInstructions.size()) == 0) {
        generator.Nop nop = new generator.Nop();
        program.addInstruction(nop);
        return nop;
    }
    return subInstructions.get(0);
}