protected void pre(com.zms.zpc.emulator.PC pc) {
    regs = pc.cpu.regs;
    if (regs.bits.pe.get()) {
        throw new com.zms.zpc.execute.NotImplException();
    }else {
        bits = 16;
    }
    instruction.mrs.reg8 = false;
    instruction.bits = regs.bits;
    instruction.mrs.regType = 0;
    instruction.segBase = "DS";
    instruction.mrs.opWidth = -1;
    instruction.pc = pc;
}