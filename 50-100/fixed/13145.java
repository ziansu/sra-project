@java.lang.Override
public void generateInstruction(java.util.List<IR.Instruction.Instruction> instructionList) {
    expression.generateInstruction(instructionList);
    operand = AST.Expression.SuffixOperation.RegisterManager.getTemporaryRegister();
    instructionList.add(new IR.Instruction.MoveInstruction(operand, expression.operand));
    instructionList.add(new IR.Instruction.UnaryInstruction(UnaryInstruction.UnaryOp.INC, expression.operand));
}