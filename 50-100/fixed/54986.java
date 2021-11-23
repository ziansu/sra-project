private void copyBlock(com.alphatica.genotick.instructions.InstructionList destination, com.alphatica.genotick.instructions.InstructionList source, int start, int stop) {
    assert start <= stop : "start > stop " + (java.lang.String.format("%d %d", start, stop));
    for (int i = start; i <= stop; i++) {
        com.alphatica.genotick.instructions.Instruction instruction = source.getInstruction(i).copy();
        if (instruction instanceof com.alphatica.genotick.instructions.TerminateInstructionList) {
            break;
        }
        addInstructionToInstructionList(instruction, destination);
    }
}