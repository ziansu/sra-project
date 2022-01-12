@java.lang.Override
public generator.Instruction visitPrintStat(generator.PrintStat node) throws parser.ParseException {
    generator.Instruction result = visit(node.getExpression());
    addInstruction(new generator.Write(regs.getAndReleaseReg(node.getExpression()), sprockell.types.Address.STANDARD_IO));
    return result;
}