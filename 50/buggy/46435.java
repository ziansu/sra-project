public void incrementPC() {
    (pc)++;
    current = next;
    next = new com.wcmarshall.jpropsim.disassembler.Instruction(cogram[((pc) + 1)]);
}