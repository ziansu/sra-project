@java.lang.Override
public generator.Instruction visitAssignStat(generator.AssignStat node) throws parser.ParseException {
    generator.Instruction result = visit(node.getExpression());
    program.addInstruction(new generator.Store(regs.getAndReleaseReg(node.getExpression()), new sprockell.types.Address(variables.lookupOffset(node.getVarID().getName()))));
    return result;
}