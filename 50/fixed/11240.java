public static int getOpcodeShifted(int instruction) {
    return (instruction & (scot.provan.javamips.assembler.Instruction.OPCODE)) >>> (scot.provan.javamips.assembler.Instruction.OPCODE_SHIFT);
}