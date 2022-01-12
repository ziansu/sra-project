private void assemble(java.lang.String[] parts, boolean assembleBranchLabels) {
    try {
        assembler.Instruction instruction = assembler.Instruction.valueOf(parts[0]);
        java.lang.String[] assembled = instruction.assemble(parts, symbolTable, pc, java.lang.System.out, lineNo, filename);
        pc += assembled.length;
        for (java.lang.String i : assembled) {
            program.add(i);
        }
    } catch (java.lang.IllegalArgumentException iae) {
    }
}