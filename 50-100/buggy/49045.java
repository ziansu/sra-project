public void printEpilog() {
    int numberOfAllocatedTotalInStack = 4 * (2 + (formals.numberOfArgs()));
    CodeGenarator.numberOfMemoryStackPtrShouldOverrideInReturn = numberOfAllocatedTotalInStack;
    AST.CodeGenarator.printADDICommand(MIPS_COMMANDS.STACK_PTR, MIPS_COMMANDS.FRAME_PTR, numberOfAllocatedTotalInStack);
    AST.CodeGenarator.printLWCommand(MIPS_COMMANDS.FRAME_PTR, MIPS_COMMANDS.FRAME_PTR, 4);
    AST.CodeGenarator.printJRCommand(MIPS_COMMANDS.RA);
}