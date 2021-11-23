@java.lang.Override
public generator.Instruction visitPrefixExpression(generator.PrefixExpression node) throws parser.ParseException {
    generator.Instruction result = visit(node.getExpression());
    sprockell.types.Operator op = null;
    switch (node.getOperator()) {
        case MINUS :
            op = sprockell.types.Operator.MUL;
            break;
        case NOT :
        case BIT_FLIP :
            op = sprockell.types.Operator.XOR;
            break;
    }
    addInstruction(new generator.Compute(op, regs.getNegOne(program), regs.getAndReleaseReg(node.getExpression()), regs.getReg(node)));
    return result;
}