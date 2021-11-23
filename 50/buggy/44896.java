void executeCycle() {
    fetchInstruction();
    executeInstruction();
    setPc(((getPc()) + (instructionRegister.getSize())));
}