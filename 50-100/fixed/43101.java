public void simulate(mars.mips.instructions.ProgramStatement statement) throws mars.mips.instructions.ProcessingException {
    int[] operands = statement.getOperands();
    int and = (mars.mips.instructions.RegisterFile.getValue(operands[1])) & (((operands[2]) << 16) >> 16);
    mars.mips.instructions.Coprocessor0.updateRegister(16, (and == 0 ? 1 : 0));
    mars.mips.instructions.Coprocessor0.updateRegister(17, (and < 0 ? 1 : 0));
    mars.mips.instructions.RegisterFile.updateRegister(operands[0], and);
}