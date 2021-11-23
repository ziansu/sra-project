private java.lang.Object execute(wyil.util.Codes.Switch bytecode, wyil.util.Constant[] frame, wyil.util.Interpreter.Context context) {
    wyil.util.Constant operand = frame[bytecode.operand];
    for (wycc.util.Pair<wyil.util.Constant, java.lang.String> branch : bytecode.branches) {
        wyil.util.Constant caseOperand = branch.first();
        if (caseOperand.equals(operand)) {
            return context.getLabel(branch.second());
        }
    }
    return context.getLabel(bytecode.defaultTarget);
}