public boolean executeIRet() {
    com.zms.zpc.execute.Regs regs = pc.cpu.regs;
    regs.rip.setValue(pop_(16));
    regs.cs.setValue(pop_(16));
    regs.flags.setValue(pop_(16));
    return false;
}