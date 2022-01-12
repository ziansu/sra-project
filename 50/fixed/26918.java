@java.lang.Override
public generator.Instruction visitSpidExpression(generator.SpidExpression node) {
    regs.setReg(node, Register.SPROCKELL_ID);
    return addInstruction(new generator.Nop());
}