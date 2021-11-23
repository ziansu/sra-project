void executeCycle() {
    fetchInstruction();
    setPc(((getPc()) + (instructionRegister.getSize())));
    executeInstruction();
}