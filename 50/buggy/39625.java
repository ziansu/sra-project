public void setPC(int n) {
    pc = n;
    current = new com.wcmarshall.jpropsim.disassembler.Instruction(cogram[pc]);
    next = new com.wcmarshall.jpropsim.disassembler.Instruction(cogram[((pc) + 1)]);
}