private static assembler.OpCodeNode rootIN() {
    assembler.InstructionSet.root = new assembler.OpCodeNode(Z80.patWord, Z80.BAD_OPCODE);
    assembler.InstructionSet.branch = new assembler.OpCodeNode[]{ new assembler.OpCodeNode(Z80.patLIT_A, Z80.BAD_OPCODE) , new assembler.OpCodeNode(Z80.patEXP_ADD, "IN_2") };
    assembler.InstructionSet.root.addBranch(assembler.InstructionSet.branch);
    assembler.InstructionSet.branch = new assembler.OpCodeNode[]{ new assembler.OpCodeNode(Z80.patR8, Z80.BAD_OPCODE) , new assembler.OpCodeNode(Z80.patIND_C, "IN_3") };
    assembler.InstructionSet.root.addBranch(assembler.InstructionSet.branch);
    return assembler.InstructionSet.root;
}